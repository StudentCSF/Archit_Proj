import service.CharacterDefenseService

fun main() {
    val a = mutableListOf(1, 2)
    val b = listOf(10.0f, 20.0f)
    CharacterDefenseService().updateHp(a, b)
    println(a)
}