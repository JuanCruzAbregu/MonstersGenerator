package com.abregujuancruz.monsters.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class MonstersResponse(
    val count: Int? = null,
    val results: List<MonstersURL>? = null
) : Parcelable