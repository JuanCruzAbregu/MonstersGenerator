package com.abregujuancruz.monsters.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Proficiency(
    val proficiency: ProficiencyX,
    val value: Int
): Parcelable