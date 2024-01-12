package com.abregujuancruz.monsters.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DamageType(
    val index: String,
    val name: String,
    val url: String
): Parcelable