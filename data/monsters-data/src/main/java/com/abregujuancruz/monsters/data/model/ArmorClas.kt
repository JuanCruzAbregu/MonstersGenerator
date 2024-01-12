package com.abregujuancruz.monsters.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ArmorClas(
    val type: String,
    val value: Int
) : Parcelable