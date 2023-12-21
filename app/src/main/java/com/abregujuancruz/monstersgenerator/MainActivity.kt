package com.abregujuancruz.monstersgenerator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.abregujuancruz.util.Screens
import com.abregujuancruz.monstersgenerator.navigation.SetupNavGraph
import com.abregujuancruz.theme.AppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            AppTheme {
                val navController = rememberNavController()
                SetupNavGraph(
                    startDestination = Screens.Generator.route,
                    navController = navController
                )
            }

        }
    }
}