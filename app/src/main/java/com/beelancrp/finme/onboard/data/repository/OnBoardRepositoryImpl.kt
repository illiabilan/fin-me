package com.beelancrp.finme.onboard.data.repository

import com.beelancrp.finme.onboard.data.data_store.OnBoardDataStore
import com.beelancrp.finme.onboard.domain.repository.OnBoardRepository
import kotlinx.coroutines.flow.firstOrNull

class OnBoardRepositoryImpl(
    private val dataStore: OnBoardDataStore
) : OnBoardRepository {

    override suspend fun setUserLoggedIn() {
        dataStore.saveUserLogged()
    }

    override suspend fun isUserLoggedIn(): Boolean {
        return dataStore.getUserLoggedIn().firstOrNull() ?: false
    }
}