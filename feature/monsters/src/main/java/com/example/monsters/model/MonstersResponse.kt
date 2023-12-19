package com.example.monsters.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class MonstersResponse(
    val results: List<MonstersURL>? = null
) : Parcelable