package com.abregujuancruz.monsters.ui.view

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.abregujuancruz.monsters.ui.model.ArmorClass
import com.abregujuancruz.monsters.ui.model.MonsterData
import com.abregujuancruz.monsters.ui.model.state.MonsterUiState
import com.abregujuancruz.monsters.ui.viewmodel.MonstersViewModel

@Composable
fun MonstersScreenContainer(
    viewModel: MonstersViewModel
) {

    val uiState: MonsterUiState by viewModel.uiState
        .collectAsStateWithLifecycle(initialValue = MonsterUiState.Loading)

    val lifecycle = LocalLifecycleOwner.current.lifecycle

    DisposableEffect(lifecycle) {
        lifecycle.addObserver(viewModel)
        onDispose {
            lifecycle.removeObserver(viewModel)
        }
    }

    when (val state = uiState) {
        MonsterUiState.Loading -> Log.e("JCA", MonsterUiState.Loading.toString())
        is MonsterUiState.Success ->
            MonsterScreen()
    }

}