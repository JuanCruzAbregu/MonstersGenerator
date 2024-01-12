package com.abregujuancruz.monsters.ui.viewmodel

import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.ViewModel
import com.abregujuancruz.monsters.data.repository.MonsterRepository
import com.abregujuancruz.monsters.ui.model.state.MonsterUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class MonstersViewModel @Inject constructor(
    private val monsterRepository: MonsterRepository
) : ViewModel(), DefaultLifecycleObserver {

    private val _uiState: MutableStateFlow<MonsterUiState> =
        MutableStateFlow(MonsterUiState.Loading)

    val uiState = _uiState.asStateFlow()

    init {
        loadMonstersList()
    }


    private fun loadMonstersList() {

    }
}