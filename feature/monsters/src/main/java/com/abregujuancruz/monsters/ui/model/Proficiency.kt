package com.abregujuancruz.monsters.ui.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Proficiency(
    val proficiency: ProficiencyX,
    val value: Int
): Parcelable