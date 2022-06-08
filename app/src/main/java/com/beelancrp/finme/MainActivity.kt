package com.beelancrp.finme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.compose.rememberNavController
import com.beelancrp.finme.navigation.FinMeNavigation
import com.beelancrp.finme.splash.SplashViewModel
import com.beelancrp.finme.ui_kit.theme.FinMeTheme
import com.google.accompanist.pager.ExperimentalPagerApi
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@ExperimentalPagerApi
@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var splashViewModel: SplashViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen().setKeepOnScreenCondition {
            !splashViewModel.loading.value
        }
        setContent {
            FinMeTheme {
                val screen = splashViewModel.startDestination.value.route
                val navController = rememberNavController()
                FinMeNavigation(navHostController = navController, startDestination = screen)
            }
        }
    }
}