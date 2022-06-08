package com.beelancrp.finme.splash

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.beelancrp.finme.navigation.Navigation
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor() : ViewModel() {

    private val _startDestination = mutableStateOf(Navigation.Onboard)
    val startDestination : State<Navigation> = _startDestination

    private val _loading = mutableStateOf(true)
    val loading: State<Boolean> = _loading
}