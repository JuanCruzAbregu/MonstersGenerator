package com.abregujuancruz.util

sealed class Screens(val route: String) {
    data object Generator: Screens(route = "generator_screen")
    data object Monsters: Screens(route = "monsters_screen")
}