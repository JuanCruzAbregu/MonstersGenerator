package com.abregujuancruz.monsters.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class MonstersURL(
    val index: String? = null,
    val name: String? = null,
    val url: String? = null
) : Parcelable