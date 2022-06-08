package com.beelancrp.navigation.domain.model

sealed class Navigation(
    val route: String
) {
    object Home : Navigation("home_screen")
    object Onboard : Navigation("onboard_screen")
}