package com.mvcoding.expensius.firebase.extensions

import com.mvcoding.expensius.aRandomItem
import com.mvcoding.expensius.firebase.model.FirebaseSettings
import com.mvcoding.expensius.model.SubscriptionType
import com.mvcoding.expensius.model.aStringCurrencyCode

fun aFirebaseSettings() = FirebaseSettings(aStringCurrencyCode(), SubscriptionType.values().aRandomItem().name)
fun FirebaseSettings.withMainCurrency(currencyCode: String?) = copy(mainCurrency = currencyCode)
fun FirebaseSettings.withSubscriptionType(subscriptionType: String?) = copy(subscriptionType = subscriptionType)