package com.beelancrp.finme.onboard.data.data_store

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.emptyPreferences
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map
import java.io.IOException

val Context.onBoardStore: DataStore<Preferences> by preferencesDataStore("on_board_pref")

class OnBoardDataStore(
    context: Context
) {

    private val dataStore = context.onBoardStore

    suspend fun saveUserLogged() {
        dataStore.edit {
            it[PrefKey.loggedKey] = true
        }
    }

    fun getUserLoggedIn(): Flow<Boolean> = dataStore.data
        .catch { error ->
            if (error is IOException) {
                emit(emptyPreferences())
            } else {
                throw error
            }
        }.map { pref -> pref[PrefKey.loggedKey] ?: false }

    private object PrefKey {
        val loggedKey = booleanPreferencesKey("is_logged")
    }
}