package com.abregujuancruz.database.api

import com.abregujuancruz.generator.ui.model.GeneratorResponse
import com.example.monsters.ui.model.MonsterData
import com.example.monsters.ui.model.MonstersResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface DnDApi {

    @GET("api")
    suspend fun getDnDResponse(): Response<GeneratorResponse>


    @GET("api/monsters")
    suspend fun getMonstersResponse(): Response<MonstersResponse>


    @GET("api/monsters/{index}")
    suspend fun getMonsterData(
        @Path("index") index: String
    ): Response<MonsterData>
}
