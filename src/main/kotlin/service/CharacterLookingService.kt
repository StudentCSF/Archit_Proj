package service

class CharacterLookingService {
    fun updateLookAtLeft(oldValues: MutableList<Boolean>, newValues: List<Boolean>) {
        for (i in 0..<oldValues.size) {
            oldValues[i] = newValues[i]
        }
    }
}