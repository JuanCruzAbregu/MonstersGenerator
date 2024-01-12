package com.example.base.repository.contract

import com.example.base.model.BaseResponse
import kotlinx.coroutines.flow.Flow

interface BaseRepositoryContract {
    suspend fun getBaseResponse(): Flow<BaseResponse>
}