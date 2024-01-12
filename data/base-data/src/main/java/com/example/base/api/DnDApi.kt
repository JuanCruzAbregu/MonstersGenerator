package com.example.base.api

import com.example.base.model.BaseResponse
import retrofit2.Response
import retrofit2.http.GET

interface DnDApi {

    @GET("api")
    suspend fun getBaseResponse(): Response<BaseResponse>

}