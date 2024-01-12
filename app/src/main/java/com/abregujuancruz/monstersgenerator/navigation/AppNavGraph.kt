package com.abregujuancruz.monstersgenerator.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.abregujuancruz.generator.ui.view.GeneratorScreen
import com.abregujuancruz.monsters.ui.view.MonstersScreen
import com.abregujuancruz.monstersgenerator.navigation.model.BottomNavItems

@Composable
fun AppNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomNavItems.Generator.route
    ) {
        generatorRoute()
        monstersRoute()
    }
}

private fun NavGraphBuilder.generatorRoute() {
    composable(route = BottomNavItems.Generator.route) {
        GeneratorScreen()
    }
}

private fun NavGraphBuilder.monstersRoute() {
    composable(route = BottomNavItems.Monsters.route) {
        MonstersScreen()
    }
}
