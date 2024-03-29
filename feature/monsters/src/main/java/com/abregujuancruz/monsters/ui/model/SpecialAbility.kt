package com.abregujuancruz.monsters.ui.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class SpecialAbility(
    val dc: DcX,
    val desc: String,
    val name: String
) : Parcelable