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

package com.mvcoding.expensius.feature.splash

//class SplashActivity : BaseActivity(), SplashPresenter.View {

//    private val presenter by lazy { provideSplashPresenter() }
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
//    override fun hideLoading() {
//    }
//
//    override fun showError(error: Error) {
//    }
//
//    override fun showLoading() {
//    }
//
//    override fun showResolvableError(error: Error): Single<ErrorResolution> {
//        return Single.just(ErrorResolution.NEGATIVE)
//    }
//
//    override fun displayLogin(destination: Destination) = LoginActivity.start(this, destination)
//    override fun displayApp() = OverviewActivity.start(this)
//    override fun close() = finish()
//}