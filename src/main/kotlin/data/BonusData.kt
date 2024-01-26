package data

data class BonusData(
    val duration: Float,
    val type: BonusTypeEnum,
    var remainingTime: Float,
)
