package com.example.base.repository

import com.example.base.api.DnDApi
import com.example.base.repository.contract.BaseRepositoryContract
import com.example.base.model.BaseResponse
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class BaseRepository(
    private val dndApi: DnDApi
) : BaseRepositoryContract {
    override suspend fun getBaseResponse(): Flow<BaseResponse> =
        flow {
            dndApi.getBaseResponse()
        }
}
