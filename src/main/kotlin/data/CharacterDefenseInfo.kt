package data

data class CharacterDefenseInfo(
    var hp: Int,
    var armor: Int,
    var lifeCount: Int,
    var iceResistance: Float,
    var fireResistance: Float,
    var electricityResistance: Float,
    var poisonResistance: Float,
    var hasShield: Boolean
)
