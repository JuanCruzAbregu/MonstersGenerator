package com.abregujuancruz.monsters.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Action(
    val actions: List<ActionX>,
    val attackBonus: Int,
    val damage: List<Damage>,
    val dc: Dc,
    val desc: String,
    val multiattackType: String,
    val name: String,
    val usage: Usage
): Parcelable