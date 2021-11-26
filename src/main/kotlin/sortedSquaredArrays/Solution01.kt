package sortedSquaredArrays

class Solution01 : SortedSquaredArraysSolver {
    /**
     * O(nlogn) time | O(n) space
     */
    override fun sortedSquaredArray(array: List<Int>): List<Int> {
        val sortedSquares = MutableList(array.size) { 0 }

        for (i in array.indices) {
            val value = array[i]
            sortedSquares[i] = value * value
        }

        sortedSquares.sort()

        return sortedSquares
    }
}