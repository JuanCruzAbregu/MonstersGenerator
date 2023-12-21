package com.abregujuancruz.database.api

import com.abregujuancruz.generator.ui.model.GeneratorResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.withContext
import javax.inject.Inject

class APIService @Inject constructor(
    private val dndAPI: DnDApi
) {
    suspend fun getDnDData(): Flow<GeneratorResponse> =
        flowOf(
            withContext(Dispatchers.IO) {
                val response = dndAPI.getDnDResponse()
                response.body() ?: GeneratorResponse()
            }
        )
}
