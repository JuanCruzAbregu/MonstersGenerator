package com.abregujuancruz.monsters.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.abregujuancruz.monsters.data.repository.MonsterRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MonstersViewModel @Inject constructor(
    private val monsterRepository: MonsterRepository
) : ViewModel() {

    init {
        loadMonstersList()
    }


    private fun loadMonstersList() {

    }
}