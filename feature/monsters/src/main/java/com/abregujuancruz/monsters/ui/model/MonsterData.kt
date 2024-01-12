package com.abregujuancruz.monsters.ui.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class MonsterData(
    val actions: List<Action>? = null,
    val alignment: String? = null,
    val armorClass: List<ArmorClass>? = null,
    val challengeRating: Int? = null,
    val charisma: Int? = null,
    val constitution: Int? = null,
    val dexterity: Int? = null,
    val hitDice: String? = null,
    val hitPoints: Int? = null,
    val hitPointsRoll: String? = null,
    val image: String? = null,
    val index: String? = null,
    val intelligence: Int? = null,
    val languages: String? = null,
    val legendaryActions: List<LegendaryAction>? = null,
    val name: String? = null,
    val proficiencies: List<Proficiency>? = null,
    val proficiencyBonus: Int? = null,
    val senses: Senses? = null,
    val size: String? = null,
    val specialAbilities: List<SpecialAbility>? = null,
    val speed: Speed? = null,
    val strength: Int? = null,
    val type: String? = null,
    val url: String? = null,
    val wisdom: Int? = null,
    val xp: Int? = null
): Parcelable