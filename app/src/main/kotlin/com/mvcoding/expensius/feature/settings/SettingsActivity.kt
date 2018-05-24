/*
 * Copyright (C) 2018 Mantas Varnagiris.
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

package com.mvcoding.expensius.feature.settings

import com.mvcoding.expensius.feature.BaseActivity

class SettingsActivity : BaseActivity()/*, SettingsPresenter.View*/ {
//    companion object {
//        fun start(context: Context) = ActivityStarter(context, SettingsActivity::class).start()
//    }
//
//    private val presenter by lazy { provideSettingsPresenter() }
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_settings)
//
//        with(mainCurrencySettingsItemView as SettingsItemView) {
//            setTitle(getString(R.string.main_currency))
//        }
//        with(supportDeveloperSettingsItemView as SettingsItemView) {
//            setTitle(getString(R.string.support_developer))
//        }
//        with(versionSettingsItemView as SettingsItemView) {
//            setTitle(getString(R.string.about))
//            setSubtitle("v${BuildConfig.VERSION_NAME}")
//        }
//    }
//
//    override fun onStart() {
//        super.onStart()
//        presenter.attach(this)
//    }
//
//    override fun onStop() {
//        super.onStop()
//        presenter.detach(this)
//    }
//
//    override fun loginRequests() = userSettingsItemView.clicks()
//    override fun mainCurrencyRequests() = mainCurrencySettingsItemView.clicks()
//    override fun supportDeveloperRequests() = supportDeveloperSettingsItemView.clicks()
//    override fun aboutRequests() = versionSettingsItemView.clicks()
//
//    override fun chooseMainCurrency(currencies: List<Currency>): Observable<Currency> = Observable.create {
//        val displayCurrencies = currencies.map { it.displayName() }
//        val itemHeight = getDimensionFromTheme(R.attr.actionBarSize)
//        val keyline = resources.getDimensionPixelSize(R.dimen.keyline)
//        val keylineHalf = resources.getDimensionPixelOffset(R.dimen.keyline_half)
//        val popupWindow = ListPopupWindow(this)
//        popupWindow.anchorView = mainCurrencySettingsItemView
//        popupWindow.setAdapter(ArrayAdapter<String>(this, R.layout.item_view_currency, R.id.currencyCodeTextView, displayCurrencies))
//        popupWindow.setOnItemClickListener { _, _, position, _ -> it.onNext(currencies[position]); popupWindow.dismiss() }
//        popupWindow.setOnDismissListener { it.onComplete() }
//        popupWindow.width = contentView.width - keyline
//        popupWindow.height = min(contentView.height - mainCurrencySettingsItemView.bottom - itemHeight - keylineHalf, itemHeight * 7)
//        popupWindow.isModal = true
//        popupWindow.horizontalOffset = keylineHalf
//        popupWindow.show()
//    }
//
//    override fun showAppUser(appUser: AppUser) {
//        with(userSettingsItemView as SettingsItemView) {
//            setTitle(getString(if (appUser.isNotAnonymous()) R.string.logged_in_as else R.string.login))
//            setSubtitle(if (appUser.isNotAnonymous()) appUser.email.address else "")
//        }
//    }
//
//    override fun showMainCurrency(mainCurrency: Currency) = with(mainCurrencySettingsItemView as SettingsItemView) { setSubtitle(mainCurrency.displayName()) }
//    override fun showSubscriptionType(subscriptionType: SubscriptionType) = with(supportDeveloperSettingsItemView as SettingsItemView) {
//        setSubtitle(when (subscriptionType) {
//            SubscriptionType.FREE -> getString(R.string.long_user_is_using_free_version)
//            SubscriptionType.PREMIUM_PAID -> getString(R.string.long_user_is_using_premium_version)
//        })
//    }
//
//    override fun displaySupportDeveloper(): Unit = PremiumActivity.start(this)
//    override fun displayLogin(destination: Destination): Unit = LoginActivity.start(this, destination)
//
//    override fun displayAbout() {
//        CustomTabsIntent.Builder()
//                .setShowTitle(true)
//                .setToolbarColor(getColorFromTheme(R.attr.colorPrimary))
//                .setSecondaryToolbarColor(getColorFromTheme(R.attr.colorAccent))
//                .enableUrlBarHiding()
//                .build()
//                .launchUrl(this, Uri.parse("https://github.com/mvarnagiris/expensius/blob/dev/CHANGELOG.md"))
//    }
}