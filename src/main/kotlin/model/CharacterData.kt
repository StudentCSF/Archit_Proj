package model

data class CharacterData(
    val xList: MutableList<Float>,
    val yList: MutableList<Float>,
    val velocityXList: MutableList<Float>,
    val velocityYList: MutableList<Float>,
    val maxSpeedList: MutableList<Float>,
    val hpList: MutableList<Int>,
    val energyList: MutableList<Int>,
    val armorList: MutableList<Int>,
    val iceResistanceList: MutableList<Float>,
    val fireResistanceList: MutableList<Float>,
    val electricityResistanceList: MutableList<Float>,
    val poisonResistanceList: MutableList<Float>,
    val lookAtLeftList: MutableList<Boolean>
)
