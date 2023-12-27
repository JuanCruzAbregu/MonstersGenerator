package com.abregujuancruz.monstersgenerator.ui.view

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.abregujuancruz.monstersgenerator.navigation.AppNavGraph
import com.abregujuancruz.monstersgenerator.ui.model.BottomNavItems
import com.abregujuancruz.theme.AppTheme
import com.abregujuancruz.ui.components.BaseToolbar
import com.abregujuancruz.ui.components.Toolbar

@Composable
fun MainScreen() {

    val navController = rememberNavController()

    AppTheme {
        Scaffold(
            topBar = { BaseToolbar(toolbarState = Toolbar.DEFAULT, title = "Generator") },
            bottomBar = {
                BottomNavigationBar(
                    navController = navController
                )
            }
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it)
            ) {
                AppNavGraph(navController = navController)
            }
        }
    }
}

@Composable
private fun BottomNavigationBar(
    navController: NavHostController,
) {
    NavigationBar {

        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination
        val items = listOf(
            BottomNavItems.Generator,
            BottomNavItems.Monsters
        )

        items.forEach { navItem ->
            NavigationBarItem(
                selected = currentRoute?.route == navItem.route,
                onClick = {
                    navController.navigate(navItem.route) {
                        launchSingleTop = true
                        restoreState = false
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                    }
                },
                alwaysShowLabel = true,
                icon = { Icon(navItem.icon, contentDescription = null) },
                label = { Text(navItem.label) }
            )

        }
    }
}

@Preview
@Composable
private fun MainScreenPreview() {
    AppTheme {
        MainScreen()
    }
}
