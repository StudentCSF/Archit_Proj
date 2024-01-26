package service

class CharacterDefenseService {

    fun updateHp(hpList: MutableList<Int>, addHpList: List<Float>) {
        for (i in hpList.indices) {
            hpList[i] += addHpList[i].toInt()
        }
    }

    fun updateArmor(armorList: MutableList<Int>, addArmorList: List<Float>) {
        for (i in armorList.indices) {
            armorList[i] += addArmorList[i].toInt()
        }
    }

    fun updateEnergy(energyList: MutableList<Int>, addEnergyList: List<Float>) {
        for (i in energyList.indices) {
            energyList[i] += addEnergyList[i].toInt()
        }
    }

    fun updateIceResistance(iceResistanceList: MutableList<Float>, addIceResistanceList: List<Float>) {
        for (i in iceResistanceList.indices) {
            iceResistanceList[i] += addIceResistanceList[i]
        }
    }

    fun updateFireResistance(fireResistanceList: MutableList<Float>, addFireResistanceList: List<Float>) {
        for (i in fireResistanceList.indices) {
            fireResistanceList[i] += addFireResistanceList[i]
        }
    }

    fun updateElectricityResistance(
        electricityResistanceList: MutableList<Float>,
        addElectricityResistanceList: List<Float>
    ) {
        for (i in electricityResistanceList.indices) {
            electricityResistanceList[i] += addElectricityResistanceList[i]
        }
    }

    fun updatePoisonResistance(poisonResistanceList: MutableList<Float>, addPoisonResistanceList: List<Float>) {
        for (i in poisonResistanceList.indices) {
            poisonResistanceList[i] += addPoisonResistanceList[i]
        }
    }
}