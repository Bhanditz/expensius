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

package com.mvcoding.expensius.feature

import com.mvcoding.expensius.feature.ReportStep.Step.DAY
import com.mvcoding.expensius.feature.ReportStep.Step.MONTH
import org.hamcrest.CoreMatchers.equalTo
import org.joda.time.DateTime
import org.joda.time.Interval
import org.junit.Assert.assertThat
import org.junit.Test
import rx.observers.TestSubscriber

class ReportStepTest {
    val subscriber = TestSubscriber.create<ReportStep.Step>()
    val reportStep = ReportStep()

    @Test
    fun initiallyGivesDay() {
        reportStep.step().subscribe(subscriber)

        subscriber.assertValue(DAY)
    }

    @Test
    fun changingFilterValuesEmitsUpdatedFilter() {
        reportStep.step().subscribe(subscriber)

        reportStep.setStep(MONTH)

        subscriber.assertValues(DAY, MONTH)
    }

    @Test
    fun numberOfStepsIs0WhenIntervalIsEmptyOrDoesNotFillThePeriod() {
        val anyDate = DateTime()
        val emptyInterval = Interval(0, 0)

        ReportStep.Step.values().forEach {
            assertThat(it.toNumberOfSteps(emptyInterval), equalTo(0))
            assertThat("$it", it.toNumberOfSteps(Interval(anyDate, it.toPeriod().minusMinutes(1))), equalTo(0))
        }
    }

    @Test
    fun numberOfStepsIs1WhenIntervalIsSameAsStep() {
        val anyDate = DateTime()

        ReportStep.Step.values().forEach { assertThat("$it", it.toNumberOfSteps(Interval(anyDate, it.toPeriod())), equalTo(1)) }
    }

    @Test
    fun numberOfStepsIs1WhenIntervalDoesNotFillTheSecondPeriod() {
        val anyDate = DateTime()

        ReportStep.Step.values().forEach {
            assertThat("$it", it.toNumberOfSteps(Interval(anyDate, it.toPeriod().plusMinutes(1))), equalTo(1))
        }
    }
}