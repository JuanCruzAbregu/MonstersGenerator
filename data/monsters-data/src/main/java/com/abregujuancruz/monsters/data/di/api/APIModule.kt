package com.abregujuancruz.monsters.data.di.api

import com.abregujuancruz.monsters.data.api.MonsterApi
import com.abregujuancruz.util.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit

@Module
@InstallIn(SingletonComponent::class)
object APIModule {

    @Provides
    fun provideAPIModule(): MonsterApi {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .build()
            .create(MonsterApi::class.java)
    }
}