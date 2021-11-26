package sortedSquaredArrays

import kotlin.math.abs

class Solution02 : SortedSquaredArraysSolver {
    /**
     * O(n) time | O(n) space
     */
    override fun sortedSquaredArray(array: List<Int>): List<Int> {
        val sortedSquares = MutableList(array.size) { 0 }
        var smallerValueIdx = 0
        var largerValueIdx = array.size - 1

        for (i in array.indices.reversed()) {
            val smallerValue = array[smallerValueIdx]
            val largerValue = array[largerValueIdx]

            if (abs(smallerValue) > abs(largerValue)) {
                sortedSquares[i] = smallerValue * smallerValue
                smallerValueIdx += 1
            } else {
                sortedSquares[i] = largerValue * largerValue
                largerValueIdx -= 1
            }
        }

        return sortedSquares
    }
}