package com.example.monsters.data.api

import com.example.monsters.data.model.MonsterData
import com.example.monsters.data.model.MonstersResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface DnDApi {

    @GET("api/monsters")
    suspend fun getMonstersResponse(): Response<MonstersResponse>


    @GET("api/monsters/{index}")
    suspend fun getMonsterData(
        @Path("index") index: String
    ): Response<MonsterData>
}