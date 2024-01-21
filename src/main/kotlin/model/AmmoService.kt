package model

class AmmoService {

    fun updatePhysicalDamage(physicalDamageList: MutableList<Float>, addPhysicalDamageList: List<Float>) {
        for (i in 0..<physicalDamageList.size) {
            physicalDamageList[i] += addPhysicalDamageList[i]
        }
    }

    fun updateIceDamage(iceDamageList: MutableList<Float>, addIceDamageList: List<Float>) {
        for (i in 0..<iceDamageList.size) {
            iceDamageList[i] += addIceDamageList[i]
        }
    }

    fun updateFireDamage(fireDamageList: MutableList<Float>, addFireDamageList: List<Float>) {
        for (i in 0..<fireDamageList.size) {
            fireDamageList[i] += addFireDamageList[i]
        }
    }

    fun updateElectricityDamage(electricityDamageList: MutableList<Float>, addElectricityDamageList: List<Float>) {
        for (i in 0..<electricityDamageList.size) {
            electricityDamageList[i] += addElectricityDamageList[i]
        }
    }

    fun updatePoisonDamage(poisonDamageList: MutableList<Float>, addPoisonDamageList: List<Float>) {
        for (i in 0..<poisonDamageList.size) {
            poisonDamageList[i] += addPoisonDamageList[i]
        }
    }
}