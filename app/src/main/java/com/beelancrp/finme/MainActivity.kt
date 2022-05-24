package com.beelancrp.finme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.beelancrp.finme.navigation.FinMeNavigation
import com.beelancrp.finme.navigation.Navigation
import com.beelancrp.finme.ui_kit.theme.FinMeTheme
import com.google.accompanist.pager.ExperimentalPagerApi

@ExperimentalPagerApi
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FinMeTheme {
                val screen = Navigation.Onboard.route
                val navController = rememberNavController()
                FinMeNavigation(navHostController = navController, startDestination = screen)
            }
        }
    }
}