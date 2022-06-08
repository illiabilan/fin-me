package com.beelancrp.finme.onboard.domain.repository

interface OnBoardRepository {

    suspend fun setUserLoggedIn()
    suspend fun isUserLoggedIn() : Boolean
}