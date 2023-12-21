package com.abregujuancruz.generator.ui.view

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.abregujuancruz.theme.Actionable
import com.abregujuancruz.theme.AppTheme

@Composable
fun GeneratorScreen(
    navigateToMonstersScreen: Actionable
) {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(),
            onClick = { },
        ) {
            Text(text = "Generate")
        }

    }
}

@Preview
@Composable
private fun Preview() {
    AppTheme {
        GeneratorScreen(navigateToMonstersScreen = {})
    }
}