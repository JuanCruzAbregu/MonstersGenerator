package com.abregujuancruz.monsters.ui.model.state

import androidx.compose.runtime.Stable
import com.abregujuancruz.monsters.ui.model.MonsterData


sealed interface MonsterUiState {
    data object Loading : MonsterUiState
    data class Success(@Stable val monsterData: MonsterData) : MonsterUiState
}