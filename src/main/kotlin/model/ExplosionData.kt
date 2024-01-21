package model

data class ExplosionData(
    val xCenterList: MutableList<Float>,
    val yCenterList: MutableList<Float>,
    val radiusList: MutableList<Float>,
    val powerList: MutableList<Float>,
)
