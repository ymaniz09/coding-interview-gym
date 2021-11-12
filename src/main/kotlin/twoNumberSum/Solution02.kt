package twoNumberSum

class Solution02 : TwoNumberSumSolver {
    /**
     * O(n) time | O(n) space
     */
    override fun twoNumberSum(array: MutableList<Int>, targetSum: Int): List<Int> {
        val numbers = mutableMapOf<Int, Boolean>()
        for (num in array) {
            val potentialMatch = targetSum - num
            if (numbers.containsKey(potentialMatch)) {
                return listOf(potentialMatch, num)
            } else {
                numbers[num] = true
            }
        }
        return listOf()
    }
}


