import service.CharacterService

fun main() {
    val a = mutableListOf(1, 2)
    val b = listOf(10.0f, 20.0f)
    CharacterService().updateHp(a, b)
    println(a)
}