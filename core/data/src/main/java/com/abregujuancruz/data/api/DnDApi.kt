package com.abregujuancruz.data.api

import com.abregujuancruz.data.model.BaseResponse
import retrofit2.Response
import retrofit2.http.GET

interface DnDApi {

    @GET("api")
    suspend fun getBaseResponse(): Response<BaseResponse>

}