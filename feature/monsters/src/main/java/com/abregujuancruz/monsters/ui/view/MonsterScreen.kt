package com.abregujuancruz.monsters.ui.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import coil.compose.AsyncImage
import com.abregujuancruz.monsters.ui.model.ArmorClass
import com.abregujuancruz.monsters.ui.model.MonsterData
import com.abregujuancruz.monsters.ui.viewmodel.MonstersViewModel
import com.abregujuancruz.theme.AppTheme

@Composable
fun MonsterScreen() {
    AppTheme {

    }
}

@Composable
private fun MonsterCard(monster: MonsterData) {
    Card {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            AsyncImage(
                model = monster.image,
                modifier = Modifier.size(120.dp),
                contentDescription = monster.image.toString()
            )

            Column(
                modifier = Modifier.fillMaxHeight()
            ) {
                monster.name?.let { name ->
                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        text = name
                    )
                } ?: "nameNull"

                monster.type?.let { type ->
                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        text = type
                    )
                } ?: "typeNull"

                monster.armorClass?.forEach { armorClass ->
                    ArmorClassInfo(armorClass)
                } ?: emptyList<ArmorClass>()

                monster.hitPoints?.let { hitPoints ->
                    Text(text = hitPoints.toString())
                } ?: "hitPointsNull"

                monster.hitDice?.let { hitDice ->
                    Text(text = hitDice)
                } ?: "hitDiceNull"
            }
        }
    }
}

@Composable
private fun ArmorClassInfo(amorClass: ArmorClass) {
    Column {
        Row {
            amorClass.type?.let { type ->
                Text(text = type)
            } ?: "armorTypeNull"

            amorClass.value?.let { value ->
                Text(text = value.toString())
            }
        }
    }
}

@Preview
@Composable
private fun Preview() {
    AppTheme {
        val viewModel: MonstersViewModel = hiltViewModel()
        MonstersScreenContainer(viewModel = viewModel)
    }
}