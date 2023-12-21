package com.example.monsters.ui.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class MonsterData(
    val index: String? = null,
    val name: String? = null,
    val type: String? = null,
    val armorClass: List<ArmorClass>? = null,
    val hitPoints: Int? = null,
    val hitDice: String? = null

) : Parcelable