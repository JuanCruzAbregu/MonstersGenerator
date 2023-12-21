package com.abregujuancruz.generator.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.abregujuancruz.generator.ui.view.GeneratorScreen
import com.abregujuancruz.theme.Actionable
import com.abregujuancruz.util.Screens

fun NavGraphBuilder.generatorRoute(
    navigateToMonstersScreen: Actionable
) {
    composable(route = Screens.Generator.route) {
        GeneratorScreen(navigateToMonstersScreen)
    }
}
