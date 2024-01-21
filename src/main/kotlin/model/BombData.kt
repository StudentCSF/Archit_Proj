package model

data class BombData(
    val xList: MutableList<Float>,
    val yList: MutableList<Float>,
    val explosionRadius: MutableList<Float>,
    val explosionPower: MutableList<Float>,
    val weightList: MutableList<Float>,
    val delayList: MutableList<Float>,
    val velocityXList: MutableList<Float>,
    val remainingToExplosionTimeList: MutableList<Float>,
    val velocityYList: MutableList<Float>,
)
