package com.example.base.di.repository

import com.example.base.repository.BaseRepository
import com.example.base.repository.contract.BaseRepositoryContract
import dagger.Binds
import dagger.Module
import dagger.Reusable
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class BaseRepositoryModule {

    @Binds
    @Reusable
    abstract fun bindMonsterRepository(baseRepository: BaseRepository):
            BaseRepositoryContract
}