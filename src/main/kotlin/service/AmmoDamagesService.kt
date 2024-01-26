package service

class AmmoDamagesService {
    fun updatePhysicalDamage(physDam: MutableList<Float>, diffPhysDam: List<Float>) {
        for (i in physDam.indices) {
            physDam[i] += diffPhysDam[i]
        }
    }

    fun updateIceDamage(iceDam: MutableList<Float>, diffIceDam: List<Float>) {
        for (i in iceDam.indices) {
            iceDam[i] += diffIceDam[i] * 0.9f
        }
    }

    fun updateFireDamage(fireDam: MutableList<Float>, diffFireDam: List<Float>) {
        for (i in fireDam.indices) {
            fireDam[i] += diffFireDam[i] * 0.8f
        }
    }

    fun updateElectricityDamage(elDam: MutableList<Float>, diffElDam: List<Float>) {
        for (i in elDam.indices) {
            elDam[i] += diffElDam[i] * 1.1f
        }
    }

    fun updatePoisonDamage(poisonDam: MutableList<Float>, diffPoisonDam: List<Float>) {
        for (i in poisonDam.indices) {
            poisonDam[i] += diffPoisonDam[i] * 0.7f
        }
    }
}