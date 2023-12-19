package com.abregujuancruz.database.api

import com.abregujuancruz.home.model.HomeResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.withContext
import javax.inject.Inject

class APIService @Inject constructor(
    private val dndAPI: DnDApi
) {
    suspend fun getDnDData(): Flow<HomeResponse> =
        flowOf(
            withContext(Dispatchers.IO) {
                val response = dndAPI.getDnDResponse()
                response.body() ?: HomeResponse()
            }
        )
}
