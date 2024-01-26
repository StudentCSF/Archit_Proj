package service

import data.AmmoDamages
import data.AmmoHolder
import data.BombData
import data.BonusData
import data.BonusTypeEnum
import data.CharacterDefenseInfo
import data.Weapon
import data.physics.KinematicsData
import data.physics.Position
import data.physics.Velocity

class GameService(
    private val charactersKinematics: MutableList<KinematicsData>,
    private val charactersDefenseInfo: MutableList<CharacterDefenseInfo>,
    private val charactersActualWeights: MutableList<Float>,
    private val characterLookAtLeft: MutableList<Boolean>,
    private val charactersWeapons: MutableList<Weapon?>,
    private val charactersBonuses: MutableList<BonusData?>,
    private val charactersIsCollidable: MutableList<Boolean>,

    private val bonusesKinematics: MutableList<KinematicsData>,
    private val freeBonuses: MutableList<BonusData>,

    private val bombsKinematics: MutableList<KinematicsData>,
    private val bombsData: MutableList<BombData>,
    private val bombsRemainingTime: MutableList<Float>,

    private val firedAmmosKinematics: MutableList<KinematicsData>,
    private val firedAmmosDamages: MutableList<AmmoDamages>,

    private val transition: Transition,
    private val characterDefenseService: CharacterDefenseService,
    private val ammoDamagesService: AmmoDamagesService,
    private val characterLookingService: CharacterLookingService,
    private val characterWeightService: CharacterWeightService,
    private val hitService: HitService
) {
    fun generateBomb() {
        bombsKinematics.add(KinematicsData(Position(1.0f, 1.0f), Velocity(0.0f, 1.0f)))
        bombsData.add(BombData(1.0f, 1.0f))
        bombsRemainingTime.add(5.0f)
    }

    fun generateBonus() {
        bonusesKinematics.add(KinematicsData(Position(1.0f, 1.0f), Velocity(0.0f, 1.0f)))
        freeBonuses.add(BonusData(10.0f, BonusTypeEnum.SHIELD, 5.0f))
    }

    fun addCharacter() {
        charactersKinematics.add(KinematicsData(Position(1.0f, 1.0f), Velocity(0.0f, 1.0f)))
        charactersDefenseInfo.add(CharacterDefenseInfo(100, 100, 1, 0.0f, 0.0f, 0.0f, 0.0f, false))
        characterLookAtLeft.add(true)
        charactersBonuses.add(null)
        charactersWeapons.add(Weapon(AmmoHolder(mutableListOf(), 30), 2.3f, 2.0f, 10.0f))
        charactersActualWeights.add(50.0f + charactersWeapons.last()!!.weight)
        charactersIsCollidable.add(true)
    }
}