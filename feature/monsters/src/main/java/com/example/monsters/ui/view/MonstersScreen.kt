package com.example.monsters.ui.view

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.abregujuancruz.theme.AppTheme
import com.abregujuancruz.theme.light_background
import com.abregujuancruz.ui.components.BaseScreen
import com.abregujuancruz.ui.components.BaseToolbar
import com.abregujuancruz.ui.components.Toolbar

@Composable
fun MonstersScreen(
    navigateToGeneratorScreen: () -> Unit,
) {
    AppTheme {
        BaseScreen(
            customToolbar = {
                BaseToolbar(
                    toolbarState = Toolbar.BACK,
                    onClick = navigateToGeneratorScreen,
                    title = "Generator"
                )
            },
            backgroundColor = light_background,
            content = { ScreenContent(navigateToGeneratorScreen) }
        )
    }
}

@Composable
private fun ScreenContent(navigateToMonstersScreen: () -> Unit) {

    Button(
        modifier = Modifier.fillMaxWidth(),
        onClick = navigateToMonstersScreen
    ) {
        Text(text = "Navegar a Generator")
    }
}

@Preview
@Composable
private fun Preview() {
    AppTheme {
        MonstersScreen(navigateToGeneratorScreen = {})
    }
}