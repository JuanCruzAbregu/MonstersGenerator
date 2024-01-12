package com.abregujuancruz.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class BaseResponse(
    val abilityScores: String? = null,
    val alignments: String? = null,
    val backgrounds: String? = null,
    val classes: String? = null,
    val conditions: String? = null,
    val damageTypes: String? = null,
    val equipment: String? = null,
    val equipmentCategories: String? = null,
    val feats: String? = null,
    val features: String? = null,
    val languages: String? = null,
    val magicItems: String? = null,
    val magicSchools: String? = null,
    val monsters: String? = null,
    val proficiencies: String? = null,
    val races: String? = null,
    val ruleSections: String? = null,
    val rules: String? = null,
    val skills: String? = null,
    val spells: String? = null,
    val subclasses: String? = null,
    val subraces: String? = null,
    val traits: String? = null,
    val weaponProperties: String? = null

) : Parcelable
