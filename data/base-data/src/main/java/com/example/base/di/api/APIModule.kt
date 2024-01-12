package com.example.base.di.api

import com.abregujuancruz.util.Constants
import com.example.base.api.DnDApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit

@Module
@InstallIn(SingletonComponent::class)
object APIModule {

    @Provides
    fun provideAPIModule(): DnDApi {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .build()
            .create(DnDApi::class.java)
    }
}