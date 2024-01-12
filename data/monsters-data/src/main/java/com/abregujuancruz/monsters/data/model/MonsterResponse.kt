package com.abregujuancruz.monsters.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class MonsterResponse(
    val count: Int? = null,
    val results: List<MonsterURL>? = null
) : Parcelable