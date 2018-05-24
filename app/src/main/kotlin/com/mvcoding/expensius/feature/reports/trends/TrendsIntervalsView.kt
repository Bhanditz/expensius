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

package com.mvcoding.expensius.feature.reports.trends

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout

class TrendsIntervalsView @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) :
        FrameLayout(context, attrs, defStyleAttr)/*, TrendsIntervalsPresenter.View */ {

//    private val presenter by lazy { provideTrendsIntervalsPresenter() }
//    private val adapter by lazy { Adapter() }
//
//    override fun onFinishInflate() {
//        super.onFinishInflate()
//        recyclerView.layoutManager = LinearLayoutManager(context)
//        recyclerView.adapter = adapter
//        recyclerView.addItemDecoration(DividerItemDecoration(getColorFromTheme(R.attr.colorDivider), resources.getDimensionPixelSize(R.dimen.divider)))
//    }
//
//    override fun onAttachedToWindow() {
//        super.onAttachedToWindow()
//        doNotInEditMode { presenter.attach(this) }
//    }
//
//    override fun onDetachedFromWindow() {
//        super.onDetachedFromWindow()
//        presenter.detach(this)
//    }
//
//    override fun showGroupedMoneys(groupedMoneys: List<GroupedMoney<Interval>>): Unit = adapter.setItems(groupedMoneys)
//
//    class Adapter : BaseAdapter<GroupedMoney<Interval>, ViewHolder>() {
//        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(parent.inflate(R.layout.item_view_trend_interval))
//        override fun onBindViewHolder(holder: ViewHolder, position: Int): Unit = holder.getView<TrendIntervalItemView>().initialize(getItem(position))
//    }
}