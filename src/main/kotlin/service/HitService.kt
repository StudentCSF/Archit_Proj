package service

import data.AmmoDamages
import data.CharacterDefenseInfo
import kotlin.math.max

class HitService {
    fun handleHit(character: CharacterDefenseInfo, ammo: AmmoDamages) {
        if (character.hasShield) {
            return
        }
        val oldArmor = character.armor
        character.armor = max(0.0f, character.armor.toFloat() - ammo.physicalDamage).toInt()
        val remPhysDam = max(0.0f, ammo.physicalDamage - oldArmor + character.armor)
        var hitHp = remPhysDam
        hitHp += (1 - character.fireResistance) * ammo.fireDamage
        hitHp += (1 - character.iceResistance) * ammo.iceDamage
        hitHp += (1 - character.electricityResistance) * ammo.electricityDamage
        hitHp += (1 - character.poisonResistance) * ammo.poisonDamage
        if (hitHp > character.hp) {
            character.hp = 0
            character.lifeCount--
        } else {
            character.hp -= hitHp.toInt()
        }
    }
}