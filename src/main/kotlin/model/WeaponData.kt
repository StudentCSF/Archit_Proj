package model

class WeaponData(
    val physicalDamageModifierList: MutableList<Float>,
    val weightList: MutableList<Float>,
    val ammoCapacityList: MutableList<Int>,
    val rateOfFireList: MutableList<Float>,
    val recoilList: MutableList<Float>,
    val reloadTimeList: MutableList<Float>,
)