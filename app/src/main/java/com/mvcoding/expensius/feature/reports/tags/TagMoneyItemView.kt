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

package com.mvcoding.expensius.feature.reports.tags

import android.content.Context
import android.util.AttributeSet
import android.widget.RelativeLayout

class TagMoneyItemView @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) :
        RelativeLayout(context, attrs, defStyleAttr) {

//    companion object {
//        fun inflate(parent: ViewGroup) = parent.inflate<TagMoneyItemView>(R.layout.item_view_tag_money)
//    }
//
//    private val moneyFormatter by lazy { provideMoneyFormatter() }
//
//    override fun onFinishInflate() {
//        super.onFinishInflate()
//        colorImageView.makeOutlineProviderOval()
//        progressBar.max = 100f
//    }
//
//    fun setTag(tag: Tag) {
//        if (tag == noTag) {
//            val color = getColorFromTheme(R.attr.colorAccent)
//            colorImageView.setColorFilter(color)
//            progressBar.progressColor = color
//            titleTextView.text = getString(R.string.no_tags)
//            titleTextView.setTextColor(color)
//        } else {
//            val color = tag.color.rgb
//            colorImageView.setColorFilter(color)
//            progressBar.progressColor = color
//            titleTextView.text = tag.title.text
//            titleTextView.setTextColor(color)
//        }
//    }
//
//    fun setMoney(money: Money) {
//        amountTextView.text = moneyFormatter.format(money)
//    }
//
//    fun setProgress(progress: Float) {
//        progressBar.progress = 100 * progress
//    }
}