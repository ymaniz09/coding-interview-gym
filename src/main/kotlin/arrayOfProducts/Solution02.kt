package arrayOfProducts

class Solution02 : ArrayOfProductsSolver {
    /**
     * O(n) time | O(n) space
     */
    override fun arrayOfProducts(array: List<Int>): List<Int> {
        val products = MutableList(array.size) { 1 }
        val leftProducts = MutableList(array.size) { 1 }
        val rightProducts = MutableList(array.size) { 1 }

        var leftRunningProduct = 1

        for (i in array.indices) {
            leftProducts[i] = leftRunningProduct
            leftRunningProduct *= array[i]
        }

        var rightRunningProduct = 1

        for (i in array.indices.reversed()) {
            rightProducts[i] = rightRunningProduct
            rightRunningProduct *= array[i]
        }

        for (i in array.indices) {
            products[i] = leftProducts[i] * rightProducts[i]
        }

        return products
    }
}