package com.beelancrp.finme.splash

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.beelancrp.finme.onboard.domain.repository.OnBoardRepository
import com.beelancrp.navigation.domain.model.Navigation
import kotlinx.coroutines.launch
import javax.inject.Inject

class SplashViewModel @Inject constructor(
    private val onBoardRepository: OnBoardRepository
) : ViewModel() {

    private val _startDestination = mutableStateOf<Navigation>(Navigation.Onboard)
    val startDestination: State<Navigation> = _startDestination

    private val _loading = mutableStateOf(true)
    val loading: State<Boolean> = _loading

    init {
        viewModelScope.launch {
            if (onBoardRepository.isUserLoggedIn()) {
                _startDestination.value = Navigation.Home
            } else {
                _startDestination.value = Navigation.Onboard
            }
            _loading.value = false
        }
    }
}