package data.physics

data class Velocity(
    var x: Float,
    var y: Float,
) {
    operator fun plus(other: Velocity): Velocity {
        return Velocity(x + other.x, y + other.y)
    }
}
