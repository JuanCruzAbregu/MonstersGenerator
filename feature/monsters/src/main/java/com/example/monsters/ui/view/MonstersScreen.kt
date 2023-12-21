package com.example.monsters.ui.view

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.abregujuancruz.theme.Actionable
import com.abregujuancruz.theme.AppTheme

@Composable
fun MonstersScreen(navigateToGeneratorScreen: Actionable) {

}

@Preview
@Composable
private fun PreviewMonstersScreen() {
    AppTheme {
        MonstersScreen(navigateToGeneratorScreen = {})
    }
}