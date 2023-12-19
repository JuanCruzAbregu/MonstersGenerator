package com.example.monsters.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class MonstersURL(
    val url: String? = null
) : Parcelable