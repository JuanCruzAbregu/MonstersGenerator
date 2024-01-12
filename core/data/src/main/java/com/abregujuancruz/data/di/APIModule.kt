package com.abregujuancruz.data.di

import com.abregujuancruz.data.api.DnDApi
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
    fun provideAPIModule(): DnDApi {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .build()
            .create(DnDApi::class.java)
    }
}