package service

import kotlin.math.max
import kotlin.math.min

class CharacterService {

    fun updatePosition(
        xList: MutableList<Float>, yList: MutableList<Float>,
        velocityXList: MutableList<Float>, velocityYList: MutableList<Float>
    ) {
        for (i in 0..<xList.size) {
            xList[i] += velocityXList[i]
        }
        for (i in 0..<yList.size) {
            yList[i] += velocityYList[i]
        }
    }

    fun updateVelocity(
        velocityXList: MutableList<Float>, velocityYList: MutableList<Float>,
        addVelocityXList: List<Float>, addVelocityYList: List<Float>, maxSpeedList: List<Float>
    ) {
        updateProjectionVelocity(velocityXList, addVelocityXList, maxSpeedList)
        updateProjectionVelocity(velocityYList, addVelocityYList, maxSpeedList)
    }

    fun updateHp(hpList: MutableList<Int>, addHpList: List<Float>) {
        for (i in 0..<hpList.size) {
            hpList[i] += addHpList[i].toInt()
        }
    }

    fun updateArmor(armorList: MutableList<Int>, addArmorList: List<Float>) {
        for (i in 0..<armorList.size) {
            armorList[i] += addArmorList[i].toInt()
        }
    }

    fun updateEnergy(energyList: MutableList<Int>, addEnergyList: List<Float>) {
        for (i in 0..<energyList.size) {
            energyList[i] += addEnergyList[i].toInt()
        }
    }

    fun updateIceResistance(iceResistanceList: MutableList<Float>, addIceResistanceList: List<Float>) {
        for (i in 0..<iceResistanceList.size) {
            iceResistanceList[i] += addIceResistanceList[i]
        }
    }

    fun updateFireResistance(fireResistanceList: MutableList<Float>, addFireResistanceList: List<Float>) {
        for (i in 0..<fireResistanceList.size) {
            fireResistanceList[i] += addFireResistanceList[i]
        }
    }

    fun updateElectricityResistance(electricityResistanceList: MutableList<Float>,
                                    addElectricityResistanceList: List<Float>) {
        for (i in 0..<electricityResistanceList.size) {
            electricityResistanceList[i] += addElectricityResistanceList[i]
        }
    }

    fun updatePoisonResistance(poisonResistanceList: MutableList<Float>, addPoisonResistanceList: List<Float>) {
        for (i in 0..<poisonResistanceList.size) {
            poisonResistanceList[i] += addPoisonResistanceList[i]
        }
    }

    private fun updateProjectionVelocity(
        velocityList: MutableList<Float>,
        addVelocityList: List<Float>,
        maxSpeedList: List<Float>
    ) {
        for (i in 0..velocityList.size) {
            val potentialNewSpeed = velocityList[i] + addVelocityList[i]
            if (potentialNewSpeed > 0) {
                velocityList[i] = min(potentialNewSpeed, maxSpeedList[i])
            } else {
                velocityList[i] = max(potentialNewSpeed, -maxSpeedList[i])
            }
        }
    }
}