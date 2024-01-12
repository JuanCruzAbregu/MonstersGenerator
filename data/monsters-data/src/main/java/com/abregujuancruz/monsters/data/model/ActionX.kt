package com.abregujuancruz.monsters.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ActionX(
    val actionName: String,
    val count: Int,
    val type: String
): Parcelable