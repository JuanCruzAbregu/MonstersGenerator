package com.abregujuancruz.monsters.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class LegendaryAction(
    val attackBonus: Int,
    val damage: List<Damage>,
    val desc: String,
    val name: String
) : Parcelable