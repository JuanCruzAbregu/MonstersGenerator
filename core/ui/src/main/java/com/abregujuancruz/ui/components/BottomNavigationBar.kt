package com.abregujuancruz.ui.components

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.abregujuancruz.navigation.model.BottomNavItems

@Composable
fun BottomNavigationBar(navController: NavHostController) {
    NavigationBar {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination
        val items = listOf(
            BottomNavItems.Generator,
            BottomNavItems.Monsters
        )
        items.forEach { item ->
            NavigationBarItem(
                selected = currentRoute?.route == item.route,
                onClick = {
                    navController.navigate(item.route) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            inclusive = false
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = false
                    }
                },
                alwaysShowLabel = false,
                icon = { Icon(item.icon, contentDescription = null) },
                label = { Text(item.label) }
            )
        }
    }
}
