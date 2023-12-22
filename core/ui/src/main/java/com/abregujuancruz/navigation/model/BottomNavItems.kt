package com.abregujuancruz.navigation.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.ui.graphics.vector.ImageVector
import com.abregujuancruz.util.Constants


sealed class BottomNavItems(val route: String, val icon: ImageVector, val label: String) {
    data object Generator : BottomNavItems(
        route = Constants.GENERATOR_SCREEN,
        icon = Icons.Default.Home,
        label = Constants.GENERATOR
    )

    data object Monsters : BottomNavItems(
        route = Constants.MONSTERS_SCREEN,
        icon = Icons.Default.AddCircle,
        label = Constants.MONSTERS
    )
}