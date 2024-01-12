package com.abregujuancruz.monsters.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ArmorClass(
    val type: String? = null,
    val value: Int? = null
): Parcelable