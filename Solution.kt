
class Solution {

    private companion object {
        const val LEFT_SHIFT = 0
        const val RIGHT_SHIFT = 1
    }

    fun stringShift(input: String, shift: Array<IntArray>): String {
        var totalShifts = 0
        for ((direction, numberOfShifts) in shift) {
            totalShifts += if (direction == LEFT_SHIFT) -numberOfShifts else numberOfShifts
        }

        if (totalShifts == 0) {
            return input
        }

        totalShifts %= input.length
        val splitIndex = (input.length - totalShifts) % input.length

        return input.substring(splitIndex, input.length) + input.substring(0, splitIndex)
    }
}
