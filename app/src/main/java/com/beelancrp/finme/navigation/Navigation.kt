package com.beelancrp.finme.navigation

sealed class Navigation(
    val route: String
) {
    object Home : Navigation("home_screen")
    object Onboard : Navigation("onboard_screen")
}