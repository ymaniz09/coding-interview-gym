package arrayOfProducts

class Solution03 : ArrayOfProductsSolver {
    /**
     * O(n) time | O(n) space
     */
    override fun arrayOfProducts(array: List<Int>): List<Int> {
        val products = MutableList(array.size) { 1 }

        var leftRunningProduct = 1

        for (i in array.indices) {
            products[i] = leftRunningProduct
            leftRunningProduct *= array[i]
        }

        var rightRunningProduct = 1

        for (i in array.indices.reversed()) {
            products[i] *= rightRunningProduct
            rightRunningProduct *= array[i]
        }

        return products
    }
}