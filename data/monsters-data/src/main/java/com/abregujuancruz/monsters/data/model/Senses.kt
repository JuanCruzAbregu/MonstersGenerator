package com.abregujuancruz.monsters.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Senses(
    val darkVision: String,
    val passivePerception: Int
): Parcelable