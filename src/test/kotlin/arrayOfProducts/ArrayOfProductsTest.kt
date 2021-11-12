package arrayOfProducts

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test

internal class ArrayOfProductsTest {

    companion object {
        lateinit var solvers: List<ArrayOfProductsSolver>

        @BeforeAll
        @JvmStatic
        fun setUp() {
            solvers = listOf(
                Solution01(),
                Solution02(),
                Solution03(),
                Solution01Java(),
                Solution02Java(),
                Solution03Java(),
            )
        }
    }

    @Test
    fun `test case 1`() {
        val array = listOf(5, 1, 4, 2)
        val answer = listOf(8, 40, 10, 20)

        solvers.map { assertEquals(answer, it.arrayOfProducts(array), it.toString()) }
    }

    @Test
    fun `test case 2`() {
        val array = listOf(1, 8, 6, 2, 4)
        val answer = listOf(384, 48, 64, 192, 96)

        solvers.map { assertEquals(answer, it.arrayOfProducts(array), it.toString()) }
    }

    @Test
    fun `test case 3`() {
        val array = listOf(-5, 2, -4, 14, -6)
        val answer = listOf(672, -1680, 840, -240, 560)

        solvers.map { assertEquals(answer, it.arrayOfProducts(array), it.toString()) }
    }

    @Test
    fun `test case 4`() {
        val array = listOf(9, 3, 2, 1, 9, 5, 3, 2)
        val answer = listOf(1620, 4860, 7290, 14580, 1620, 2916, 4860, 7290)

        solvers.map { assertEquals(answer, it.arrayOfProducts(array), it.toString()) }
    }

    @Test
    fun `test case 5`() {
        val array = listOf(4, 4)
        val answer = listOf(4, 4)

        solvers.map { assertEquals(answer, it.arrayOfProducts(array), it.toString()) }
    }

    @Test
    fun `test case 6`() {
        val array = listOf(0, 0, 0, 0)
        val answer = listOf(0, 0, 0, 0)

        solvers.map { assertEquals(answer, it.arrayOfProducts(array), it.toString()) }
    }

    @Test
    fun `test case 7`() {
        val array = listOf(1, 1, 1, 1)
        val answer = listOf(1, 1, 1, 1)

        solvers.map { assertEquals(answer, it.arrayOfProducts(array), it.toString()) }
    }

    @Test
    fun `test case 8`() {
        val array = listOf(-1, -1, -1)
        val answer = listOf(1, 1, 1)

        solvers.map { assertEquals(answer, it.arrayOfProducts(array), it.toString()) }
    }

    @Test
    fun `test case 9`() {
        val array = listOf(-1, -1, -1, -1)
        val answer = listOf(-1, -1, -1, -1)

        solvers.map { assertEquals(answer, it.arrayOfProducts(array), it.toString()) }
    }

    @Test
    fun `test case 10`() {
        val array = listOf(0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
        val answer = listOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)

        solvers.map { assertEquals(answer, it.arrayOfProducts(array), it.toString()) }
    }

    @Test
    fun `test case 11`() {
        val array = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
        val answer = listOf(362880, 0, 0, 0, 0, 0, 0, 0, 0, 0)

        solvers.map { assertEquals(answer, it.arrayOfProducts(array), it.toString()) }
    }
}