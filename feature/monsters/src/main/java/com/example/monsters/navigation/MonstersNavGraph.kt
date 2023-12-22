package com.example.monsters.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.abregujuancruz.navigation.model.BottomNavItems
import com.example.monsters.ui.view.MonstersScreen

fun NavGraphBuilder.monstersRoute(
    navigateToGeneratorScreen: () -> Unit
) {
    composable(route = BottomNavItems.Monsters.route) {
        MonstersScreen(navigateToGeneratorScreen)
    }
}