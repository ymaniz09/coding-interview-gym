package twoNumberSum

class Solution01 : TwoNumberSumSolver {
    /**
     * O(n^2) time | O(1) space
     */
    override fun twoNumberSum(array: MutableList<Int>, targetSum: Int): List<Int> {
        for (i in 0 until array.size - 1) {
            val firstNum = array[i]
            for (j in i + 1 until array.size) {
                val secondNum = array[j]
                if (firstNum + secondNum == targetSum) {
                    return listOf(firstNum, secondNum)
                }
            }
        }
        return listOf()
    }
}