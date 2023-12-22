package com.abregujuancruz.generator.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.abregujuancruz.generator.ui.view.GeneratorScreen
import com.abregujuancruz.navigation.model.BottomNavItems

fun NavGraphBuilder.generatorRoute(
    navigateToMonstersScreen: () -> Unit
) {
    composable(route = BottomNavItems.Generator.route) {
        GeneratorScreen(navigateToMonstersScreen)
    }
}
