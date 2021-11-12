package validateSubsequence

class Solution01 : SubsequenceSolver {
    /**
     * O(n) time | O(1) space
     */
    override fun isValidSubsequence(array: List<Int>, sequence: List<Int>): Boolean {
        var arrIdx = 0
        var seqIdx = 0

        while (arrIdx < array.size && seqIdx < sequence.size) {
            if (array[arrIdx] == sequence[seqIdx]) {
                seqIdx += 1
            }
            arrIdx += 1
        }
        return seqIdx == sequence.size
    }
}