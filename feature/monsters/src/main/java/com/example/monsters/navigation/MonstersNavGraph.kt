package com.example.monsters.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.abregujuancruz.theme.Actionable
import com.abregujuancruz.util.Screens
import com.example.monsters.ui.view.MonstersScreen

fun NavGraphBuilder.monstersRoute(
    navigateToGeneratorScreen: Actionable
) {
    composable(route = Screens.Monsters.route) {
        MonstersScreen(navigateToGeneratorScreen)
    }
}