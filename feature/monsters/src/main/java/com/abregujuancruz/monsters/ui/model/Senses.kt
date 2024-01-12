package com.abregujuancruz.monsters.ui.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Senses(
    val darkVision: String,
    val passivePerception: Int
): Parcelable