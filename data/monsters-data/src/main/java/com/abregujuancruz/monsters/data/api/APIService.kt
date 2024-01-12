package com.abregujuancruz.monsters.data.api

import com.abregujuancruz.monsters.data.model.MonstersResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.withContext
import javax.inject.Inject

class APIService @Inject constructor(
    private val dndAPI: DnDApi
) {
    suspend fun getMonstersResponse(): Flow<MonstersResponse> =
        flowOf(
            withContext(Dispatchers.IO) {
                val response = dndAPI.getMonstersResponse()
                response.body() ?: MonstersResponse()
            }
        )
}