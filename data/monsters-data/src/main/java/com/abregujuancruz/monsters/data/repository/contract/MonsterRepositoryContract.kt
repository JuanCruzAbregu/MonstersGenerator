package com.abregujuancruz.monsters.data.repository.contract

import com.abregujuancruz.monsters.data.model.MonsterResponse
import kotlinx.coroutines.flow.Flow

interface MonsterRepositoryContract {
    fun getMonstersFromApi(): Flow<MonsterResponse>
}