package com.abregujuancruz.monsters.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Usage(
    val times: Int,
    val type: String
): Parcelable