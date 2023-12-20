package com.abregujuancruz.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.abregujuancruz.theme.Actionable
import com.abregujuancruz.ui.R

enum class Toolbar {
    DEFAULT,
    BACK;
}

@Composable
fun BaseToolbar(
    toolbarState: Toolbar,
    onClick: Actionable?,
    title: String
) {
    when (toolbarState) {
        Toolbar.DEFAULT -> DefaultToolbar(title = title, onClick = onClick)
        Toolbar.BACK -> BackToolbar(title = title, onClick = onClick ?: {})
    }
}

@Composable
private fun DefaultToolbar(
    title: String,
    onClick: Actionable?
) {
    if (onClick == null) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .defaultMinSize(minHeight = 48.dp)
                .background(
                    color = MaterialTheme.colorScheme.background
                )
        ) {
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 46.dp),
                text = title,
                style = MaterialTheme.typography.titleLarge
            )
        }
    }

}

@Composable
private fun BackToolbar(
    title: String,
    onClick: Actionable?
) {
    if (onClick != null) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier
                .wrapContentHeight()
                .fillMaxWidth()
                .defaultMinSize(minHeight = 48.dp)
                .background(
                    MaterialTheme.colorScheme.background
                )
        ) {
            IconButton(onClick = onClick) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_back),
                    contentDescription = stringResource(id = R.string.back)
                )
            }

            Text(
                modifier = Modifier.fillMaxWidth(),
                text = title,
                style = MaterialTheme.typography.titleLarge
            )
        }
    }

}

@Preview
@Composable
private fun DefaultToolbarPreview() {
    BaseToolbar(Toolbar.DEFAULT, null, "Titulo")
}

@Preview
@Composable
private fun BackToolbarPreview() {
    BaseToolbar(Toolbar.BACK, {}, "Titulo")
}