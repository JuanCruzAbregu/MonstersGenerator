package com.abregujuancruz.ui.components

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.rememberNavController
import com.abregujuancruz.theme.AppTheme

@Composable
fun BaseScreen(
    scrollState: ScrollState = rememberScrollState(),
    content: @Composable () -> Unit,
    customToolbar: @Composable () -> Unit,
    backgroundColor: Color
) {
    val navController = rememberNavController()

    AppTheme {
        Scaffold(
            containerColor = backgroundColor,
            modifier = Modifier
                .fillMaxSize(),
            topBar = customToolbar,
            bottomBar = { BottomNavigationBar(navController = navController) }
        ) { innerPadding ->
            Column(
                Modifier
                    .padding(innerPadding)
                    .verticalScroll(scrollState)
            ) {
                content.invoke()
            }
        }
    }
}
