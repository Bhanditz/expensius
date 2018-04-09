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

package com.mvcoding.expensius.feature.reports

class TrendsReportPresenterTest {

//    val trends = aTrendsReport()
//    val reportSettings = aReportSettings()
//    val remoteFilter = aRemoteFilter(reportSettings.reportPeriod)
//
//    val trendsSource = mock<DataSource<TrendsReport>>()
//    val reportSettingsSource = mock<DataSource<ReportSettings>>().apply { whenever(data()).thenReturn(just(reportSettings)) }
//    val primaryRemoteFilterCache = mock<Cache<RemoteFilter>>().apply { whenever(data()).thenReturn(just(remoteFilter)) }
//    val secondaryRemoteFilterCache = mock<Cache<RemoteFilter>>().apply { whenever(data()).thenReturn(just(remoteFilter)) }
//    val view = mock<TrendsReportPresenter.View>()
//    val presenter = TrendsReportPresenter(trendsSource, reportSettingsSource, primaryRemoteFilterCache, secondaryRemoteFilterCache, rxSchedulers())
//
//    @Before
//    fun setUp() {
//        whenever(trendsSource.data()).thenReturn(just(trends))
//    }
//
//    @Test
//    fun `shows trends`() {
//        presenter.attach(view)
//
//        verify(view).showTrends(trends)
//    }
//
//    @Test
//    fun `secondary remote filter points to previous period`() {
//        presenter.attach(view)
//
//        verify(secondaryRemoteFilterCache).write(remoteFilter.withPreviousInterval(reportSettings.reportPeriod))
//    }
//
//    @Test
//    fun `ignores errors`() {
//        whenever(trendsSource.data()).thenReturn(error(Throwable()))
//
//        presenter.attach(view)
//
//        verify(view, never()).showTrends(any())
//    }
}