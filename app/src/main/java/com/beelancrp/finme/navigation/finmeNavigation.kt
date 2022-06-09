package com.beelancrp.finme.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.beelancrp.finme.home.HomeScreen
import com.beelancrp.finme.onboard.OnboardScreen
import com.beelancrp.navigation.domain.model.Navigation
import com.google.accompanist.pager.ExperimentalPagerApi

@ExperimentalPagerApi
@Composable
fun FinMeNavigation(navHostController: NavHostController, startDestination: String) {
    NavHost(navController = navHostController, startDestination = startDestination) {
        composable(Navigation.Onboard.route) {
            OnboardScreen(navHostController)
        }
        composable(Navigation.Home.route) {
            HomeScreen()
        }
    }
}