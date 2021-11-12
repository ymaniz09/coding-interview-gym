package validateSubsequence

class Solution02 : SubsequenceSolver {
    /**
     * O(n) time | O(1) space
     */
    override fun isValidSubsequence(array: List<Int>, sequence: List<Int>): Boolean {
        var seqIdx = 0

        for (value in array) {
            if (seqIdx == sequence.size) {
                break
            }
            if (sequence[seqIdx] == value) {
                seqIdx += 1
            }
        }

        return seqIdx == sequence.size
    }
}