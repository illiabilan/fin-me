package com.beelancrp.finme.onboard.di

import android.content.Context
import com.beelancrp.finme.onboard.data.data_store.OnBoardDataStore
import com.beelancrp.finme.onboard.data.repository.OnBoardRepositoryImpl
import com.beelancrp.finme.onboard.domain.repository.OnBoardRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ApplicationContext

@Module
@InstallIn(ActivityComponent::class)
object OnBoardModule {

    @Provides
    fun provideOnBoardDataStore(@ApplicationContext context: Context) = OnBoardDataStore(context)

    @Provides
    fun provideOnBoardRepository(dataStore: OnBoardDataStore): OnBoardRepository =
        OnBoardRepositoryImpl(dataStore)
}