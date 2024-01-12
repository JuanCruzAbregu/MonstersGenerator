package com.abregujuancruz.monsters.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class MonsterData(
    val actions: List<Action>,
    val alignment: String,
    val armorClass: List<ArmorClas>,
    val challengeRating: Int,
    val charisma: Int,
    val constitution: Int,
    val dexterity: Int,
    val hitDice: String,
    val hitPoints: Int,
    val hitPointsRoll: String,
    val image: String,
    val index: String,
    val intelligence: Int,
    val languages: String,
    val legendaryActions: List<LegendaryAction>,
    val name: String,
    val proficiencies: List<Proficiency>,
    val proficiencyBonus: Int,
    val senses: Senses,
    val size: String,
    val specialAbilities: List<SpecialAbility>,
    val speed: Speed,
    val strength: Int,
    val type: String,
    val url: String,
    val wisdom: Int,
    val xp: Int
): Parcelable