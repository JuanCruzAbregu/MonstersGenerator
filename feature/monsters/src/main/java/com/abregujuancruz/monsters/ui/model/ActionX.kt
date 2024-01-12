package com.abregujuancruz.monsters.ui.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ActionX(
    val actionName: String,
    val count: Int,
    val type: String
): Parcelable