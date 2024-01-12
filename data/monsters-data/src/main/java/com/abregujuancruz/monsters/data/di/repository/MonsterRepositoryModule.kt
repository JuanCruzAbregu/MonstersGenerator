package com.abregujuancruz.monsters.data.di.repository

import com.abregujuancruz.monsters.data.repository.MonsterRepository
import com.abregujuancruz.monsters.data.repository.contract.MonsterRepositoryContract
import dagger.Binds
import dagger.Module
import dagger.Reusable
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class MonsterRepositoryModule {

    @Binds
    @Reusable
    abstract fun bindMonsterRepository(monsterRepository: MonsterRepository):
            MonsterRepositoryContract
}