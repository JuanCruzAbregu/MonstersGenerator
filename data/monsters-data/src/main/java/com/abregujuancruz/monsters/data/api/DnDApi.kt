package com.abregujuancruz.monsters.data.api

import com.abregujuancruz.monsters.data.model.MonstersResponse
import retrofit2.Response
import retrofit2.http.GET

interface DnDApi {

    @GET("api/monsters")
    suspend fun getMonstersResponse(): Response<MonstersResponse>

//    @GET("api/monsters/{index}")
//    suspend fun getMonsterData(
//        @Path("index") index: String
//    ): Response<MonsterData>
}
