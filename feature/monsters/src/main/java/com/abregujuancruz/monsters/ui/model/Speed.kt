package com.abregujuancruz.monsters.ui.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Speed(
    val swim: String,
    val walk: String
) : Parcelable