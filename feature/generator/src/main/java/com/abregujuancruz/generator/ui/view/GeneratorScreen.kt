package com.abregujuancruz.generator.ui.view

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.abregujuancruz.theme.AppTheme

@Composable
fun GeneratorScreen() {
    AppTheme {
        Scaffold {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it)
            ) {
                Text(
                    modifier = Modifier.align(Alignment.Center),
                    text = "Generator Screen"
                )
            }
        }
    }
}

@Preview
@Composable
private fun Preview() {
    AppTheme {
        GeneratorScreen()
    }
}
