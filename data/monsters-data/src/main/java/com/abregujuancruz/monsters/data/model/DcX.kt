package com.abregujuancruz.monsters.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DcX(
    val dcType: DcType,
    val dcValue: Int,
    val successType: String
): Parcelable