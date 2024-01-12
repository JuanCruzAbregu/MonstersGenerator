package com.abregujuancruz.monsters.data.repository

import com.abregujuancruz.monsters.data.api.MonsterApi
import com.abregujuancruz.monsters.data.model.MonsterResponse
import com.abregujuancruz.monsters.data.repository.contract.MonsterRepositoryContract
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class MonsterRepository @Inject constructor(
    private val monsterApi: MonsterApi
) : MonsterRepositoryContract {
    override fun getMonstersFromApi(): Flow<MonsterResponse> =
        flow {
            monsterApi.getMonstersResponse()
        }
}