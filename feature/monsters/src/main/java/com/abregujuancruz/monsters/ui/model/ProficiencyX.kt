package com.abregujuancruz.monsters.ui.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ProficiencyX(
    val index: String,
    val name: String,
    val url: String
): Parcelable