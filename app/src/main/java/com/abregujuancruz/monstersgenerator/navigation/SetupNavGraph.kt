package com.abregujuancruz.monstersgenerator.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.abregujuancruz.generator.navigation.generatorRoute
import com.abregujuancruz.navigation.model.BottomNavItems
import com.example.monsters.navigation.monstersRoute

@Composable
fun SetupNavGraph(navController: NavHostController) {

    NavHost(
        navController = navController,
        startDestination = BottomNavItems.Generator.route
    ) {
        generatorRoute(
            navigateToMonstersScreen = {
                navController.popBackStack()
                navController.navigate(BottomNavItems.Monsters.route)
            }
        )
        monstersRoute(
            navigateToGeneratorScreen = {
                navController.popBackStack()
                navController.navigate(BottomNavItems.Generator.route)
            }
        )
    }
}
