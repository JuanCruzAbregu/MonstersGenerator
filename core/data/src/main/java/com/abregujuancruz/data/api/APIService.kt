package com.abregujuancruz.data.api

import com.abregujuancruz.data.model.BaseResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.withContext
import javax.inject.Inject

class APIService @Inject constructor(
    private val dndAPI: DnDApi
) {
    suspend fun getBaseData(): Flow<BaseResponse> =
        flowOf(
            withContext(Dispatchers.IO) {
                val response = dndAPI.getBaseResponse()
                response.body() ?: BaseResponse()
            }
        )
}