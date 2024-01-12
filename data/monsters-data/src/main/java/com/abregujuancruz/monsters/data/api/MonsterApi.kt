package com.abregujuancruz.monsters.data.api

import com.abregujuancruz.monsters.data.model.MonsterResponse
import retrofit2.Response
import retrofit2.http.GET

interface MonsterApi {

    @GET("api/monsters")
    suspend fun getMonstersResponse(): Response<MonsterResponse>

//    @GET("api/monsters/{index}")
//    suspend fun getMonsterData(
//        @Path("index") index: String
//    ): Response<MonsterData>
}
