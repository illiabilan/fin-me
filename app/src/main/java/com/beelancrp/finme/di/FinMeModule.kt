package com.beelancrp.finme.di

import com.beelancrp.finme.onboard.di.OnBoardModule
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module(includes = [OnBoardModule::class])
@InstallIn(SingletonComponent::class)
object FinMeModule