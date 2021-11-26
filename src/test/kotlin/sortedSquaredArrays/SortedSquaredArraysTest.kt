package sortedSquaredArrays

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test

internal class SortedSquaredArraysTest {

    companion object {
        lateinit var solvers: List<SortedSquaredArraysSolver>

        @BeforeAll
        @JvmStatic
        fun setUp() {
            solvers = listOf(
                Solution01(),
                Solution02(),
            )
        }
    }

    @Test
    fun `test case 1`() {
        val array = listOf(1, 2, 3, 5, 6, 8, 9)
        val answer = listOf(1, 4, 9, 25, 36, 64, 81)

        solvers.map { assertEquals(answer, it.sortedSquaredArray(array), it.toString()) }
    }

    @Test
    fun `test case 2`() {
        val array = listOf(1)
        val answer = listOf(1)

        solvers.map { assertEquals(answer, it.sortedSquaredArray(array), it.toString()) }
    }

    @Test
    fun `test case 3`() {
        val array = listOf(1, 2)
        val answer = listOf(1, 4)

        solvers.map { assertEquals(answer, it.sortedSquaredArray(array), it.toString()) }
    }

    @Test
    fun `test case 4`() {
        val array = listOf(1, 2, 3, 4, 5)
        val answer = listOf(1, 4, 9, 16, 25)

        solvers.map { assertEquals(answer, it.sortedSquaredArray(array), it.toString()) }
    }

    @Test
    fun `test case 5`() {
        val array = listOf(0)
        val answer = listOf(0)

        solvers.map { assertEquals(answer, it.sortedSquaredArray(array), it.toString()) }
    }

    @Test
    fun `test case 6`() {
        val array = listOf(10)
        val answer = listOf(100)

        solvers.map { assertEquals(answer, it.sortedSquaredArray(array), it.toString()) }
    }

    @Test
    fun `test case 7`() {
        val array = listOf(-1)
        val answer = listOf(1)

        solvers.map { assertEquals(answer, it.sortedSquaredArray(array), it.toString()) }
    }

    @Test
    fun `test case 8`() {
        val array = listOf(-2, -1)
        val answer = listOf(1, 4)

        solvers.map { assertEquals(answer, it.sortedSquaredArray(array), it.toString()) }
    }

    @Test
    fun `test case 9`() {
        val array = listOf(-5, -4, -3, -2, -1)
        val answer = listOf(1, 4, 9, 16, 25)

        solvers.map { assertEquals(answer, it.sortedSquaredArray(array), it.toString()) }
    }

    @Test
    fun `test case 10`() {
        val array = listOf(-10)
        val answer = listOf(100)

        solvers.map { assertEquals(answer, it.sortedSquaredArray(array), it.toString()) }
    }

    @Test
    fun `test case 11`() {
        val array = listOf(-10, -5, 0, 5, 10)
        val answer = listOf(0, 25, 25, 100, 100)

        solvers.map { assertEquals(answer, it.sortedSquaredArray(array), it.toString()) }
    }

    @Test
    fun `test case 12`() {
        val array = listOf(-7, -3, 1, 9, 22, 30)
        val answer = listOf(1, 9, 49, 81, 484, 900)

        solvers.map { assertEquals(answer, it.sortedSquaredArray(array), it.toString()) }
    }

    @Test
    fun `test case 13`() {
        val array = listOf(-50, -13, -2, -1, 0, 0, 1, 1, 2, 3, 19, 20)
        val answer = listOf(0, 0, 1, 1, 1, 4, 4, 9, 169, 361, 400, 2500)

        solvers.map { assertEquals(answer, it.sortedSquaredArray(array), it.toString()) }
    }

    @Test
    fun `test case 14`() {
        val array = listOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
        val answer = listOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0)

        solvers.map { assertEquals(answer, it.sortedSquaredArray(array), it.toString()) }
    }

    @Test
    fun `test case 15`() {
        val array = listOf(-1, -1, 2, 3, 3, 3, 4)
        val answer = listOf(1, 1, 4, 9, 9, 9, 16)

        solvers.map { assertEquals(answer, it.sortedSquaredArray(array), it.toString()) }
    }

    @Test
    fun `test case 16`() {
        val array = listOf(-3, -2, -1)
        val answer = listOf(1, 4, 9)

        solvers.map { assertEquals(answer, it.sortedSquaredArray(array), it.toString()) }
    }

    @Test
    fun `test case 17`() {
        val array = listOf(-3, -2, 1)
        val answer = listOf(1, 4, 9)

        solvers.map { assertEquals(answer, it.sortedSquaredArray(array), it.toString()) }
    }
}