package com.beelancrp.finme.onboard.domain.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class OnboardItem(
    @StringRes val title: Int,
    @StringRes val desc: Int,
    @DrawableRes val image: Int
)