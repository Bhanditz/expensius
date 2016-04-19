/*
 * Copyright (C) 2016 Mantas Varnagiris.
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 */

package com.mvcoding.expensius.feature.premium

import com.mvcoding.expensius.Settings
import com.mvcoding.expensius.SubscriptionType
import com.mvcoding.expensius.SubscriptionType.FREE
import com.mvcoding.expensius.feature.*

class PremiumPresenter(
        private val settings: Settings,
        private val billingProductsProvider: BillingProductsProvider) : Presenter<PremiumPresenter.View>() {

    override fun onViewAttached(view: View) {
        super.onViewAttached(view)

        settings.subscriptionTypes().subscribeUntilDetached { view.showSubscriptionType(it) }
        view.onRefresh().subscribeUntilDetached { billingProductsProvider.refresh() }
        billingProductsProvider.loadingStates().subscribeUntilDetached { view.showLoadingState(it) }
        billingProductsProvider.emptyStates().subscribeUntilDetached { view.showEmptyState(it) }
        billingProductsProvider.data(view)
                .withLatestFrom(settings.subscriptionTypes(), { billingProducts, subscriptionType ->
                    BillingData(subscriptionType, billingProducts)
                })
                .subscribeUntilDetached {
                    view.showBillingData(it)
                }
    }

    private fun View.showSubscriptionType(subscriptionType: SubscriptionType) =
            if (subscriptionType == FREE) showFreeUser()
            else showPremiumUser()

    private fun View.showBillingData(billingData: BillingData) {
        val billingProducts = billingData.billingProducts.filter { it.subscriptionType == billingData.subscriptionType }
        showBillingProducts(billingProducts)
    }

    private data class BillingData(val subscriptionType: SubscriptionType, val billingProducts: List<BillingProduct>)

    interface View : Presenter.View, RefreshableView, EmptyView, ErrorView {
        fun showFreeUser()
        fun showPremiumUser()
        fun showBillingProducts(billingProducts: List<BillingProduct>)
    }
}