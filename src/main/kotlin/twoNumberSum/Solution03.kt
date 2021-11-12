package twoNumberSum

class Solution03 : TwoNumberSumSolver {
    /**
     * O(n log(n)) time | O(1) space
     */
    override fun twoNumberSum(array: MutableList<Int>, targetSum: Int): List<Int> {
        array.sort()
        var left = 0
        var right = array.size - 1

        while (left < right){
            val currentSum = array[left] + array[right]

            if (currentSum == targetSum) {
                return listOf(array[left], array[right])
            } else if (currentSum < targetSum) {
                left += 1
            } else if (currentSum > targetSum) {
                right -= 1
            }
        }

        return listOf()
    }
}


