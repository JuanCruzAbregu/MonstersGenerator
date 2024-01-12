package com.abregujuancruz.monsters.ui.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Damage(
    val damageDice: String,
    val damageType: DamageType
): Parcelable