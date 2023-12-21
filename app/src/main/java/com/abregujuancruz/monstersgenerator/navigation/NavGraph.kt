package com.abregujuancruz.monstersgenerator.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.abregujuancruz.generator.navigation.generatorRoute
import com.abregujuancruz.util.Screens
import com.example.monsters.navigation.monstersRoute

@Composable
fun SetupNavGraph(
    startDestination: String,
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        generatorRoute(
            navigateToMonstersScreen = {
                navController.popBackStack()
                navController.navigate(Screens.Monsters.route)
            }
        )
        monstersRoute(
            navigateToGeneratorScreen = {
                navController.popBackStack()
                navController.navigate(Screens.Generator.route)
            }
        )
    }
}
