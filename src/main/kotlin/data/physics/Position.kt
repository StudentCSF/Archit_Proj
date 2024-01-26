package data.physics

data class Position(
    var x: Float,
    var y: Float
) {
    operator fun plus(other: Position): Position {
        return Position(x + other.x, y + other.y)
    }
}
