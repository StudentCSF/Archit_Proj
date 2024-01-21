package model

data class AmmoData(
    val physicalDamageList: MutableList<Float>,
    val fireDamageList: MutableList<Float>,
    val electricityDamageList: MutableList<Float>,
    val iceDamageList: MutableList<Float>,
    val poisonDamageList: MutableList<Float>,
)
