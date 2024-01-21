package model

data class BonusData(
    val xList: MutableList<Float>,
    val yList: MutableList<Float>,
    val typeList: MutableList<BonusTypeEnum>,
    val durationList: MutableList<Float>,
    val velocityYList: MutableList<Float>,
    val remainingTimeList: MutableList<Float>
)
