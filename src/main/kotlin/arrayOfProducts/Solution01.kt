package arrayOfProducts

class Solution01 : ArrayOfProductsSolver {
    /**
     * O(n^2) time | O(n) space
     */
    override fun arrayOfProducts(array: List<Int>): List<Int> {
        val products = MutableList(array.size) { 1 }
        for (i in array.indices) {
            var runningProduct = 1

            for (j in array.indices) {
                if (i != j) {
                    runningProduct *= array[j]
                }
            }

            products[i] = runningProduct
        }

        return products
    }
}