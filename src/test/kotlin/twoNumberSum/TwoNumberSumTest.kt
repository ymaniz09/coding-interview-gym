package twoNumberSum

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

internal class TwoNumberSumTest {

    companion object {
        lateinit var solvers: List<TwoNumberSumSolver>

        @BeforeAll
        @JvmStatic
        fun setUp() {
            solvers = listOf(
                Solution01(),
                Solution02(),
                Solution03(),
            )
        }
    }

    @Test
    fun `test case 1`() {
        val array = mutableListOf(3, 5, -4, 8, 11, 1, -1, 6)
        val targetSum = 10
        val answer = listOf(11, -1)

        solvers.map { assertEquals(answer.toSet(), it.twoNumberSum(array, targetSum).toSet(), it.toString()) }
    }

    @Test
    fun `test case 2`() {
        val array = mutableListOf(4, 6)
        val targetSum = 10
        val answer = listOf(4, 6)

        solvers.map { assertEquals(answer, it.twoNumberSum(array, targetSum), it.toString()) }
    }

    @Test
    fun `test case 3`() {
        val array = mutableListOf(4, 6, 1)
        val targetSum = 5
        val answer = listOf(4, 1)

        solvers.map { assertEquals(answer.toSet(), it.twoNumberSum(array, targetSum).toSet(), it.toString()) }
    }

    @Test
    fun `test case 4`() {
        val array = mutableListOf(4, 6, 1, -3)
        val targetSum = 3
        val answer = listOf(6, -3)

        solvers.map { assertEquals(answer.toSet(), it.twoNumberSum(array, targetSum).toSet(), it.toString()) }
    }

    @Test
    fun `test case 5`() {
        val array = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
        val targetSum = 17
        val answer = listOf(8, 9)

        solvers.map { assertEquals(answer, it.twoNumberSum(array, targetSum), it.toString()) }
    }

    @Test
    fun `test case 6`() {
        val array = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 15)
        val targetSum = 18
        val answer = listOf(3, 15)

        solvers.map { assertEquals(answer, it.twoNumberSum(array, targetSum), it.toString()) }
    }

    @Test
    fun `test case 7`() {
        val array = mutableListOf(-7, -5, -3, -1, 0, 1, 3, 5, 7)
        val targetSum = -5
        val answer = listOf(-5, 0)

        solvers.map { assertEquals(answer, it.twoNumberSum(array, targetSum), it.toString()) }
    }

    @Test
    fun `test case 8`() {
        val array = mutableListOf(-21, 301, 12, 4, 65, 56, 210, 356, 9, -47)
        val targetSum = 163
        val answer = listOf(210, -47)

        solvers.map { assertEquals(answer.toSet(), it.twoNumberSum(array, targetSum).toSet(), it.toString()) }
    }

    @Test
    fun `test case 9`() {
        val array = mutableListOf(-21, 301, 12, 4, 65, 56, 210, 356, 9, -47)
        val targetSum = 164
        val answer = listOf<Int>()

        solvers.map { assertEquals(answer, it.twoNumberSum(array, targetSum), it.toString()) }
    }

    @Test
    fun `test case 10`() {
        val array = mutableListOf(3, 5, -4, 8, 11, 1, -1, 6)
        val targetSum = 15
        val answer = listOf<Int>()

        solvers.map { assertEquals(answer, it.twoNumberSum(array, targetSum), it.toString()) }
    }

    @Test
    fun `test case 11`() {
        val array = mutableListOf(14)
        val targetSum = 15
        val answer = listOf<Int>()

        solvers.map { assertEquals(answer, it.twoNumberSum(array, targetSum), it.toString()) }
    }

    @Test
    fun `test case 12`() {
        val array = mutableListOf(15)
        val targetSum = 15
        val answer = listOf<Int>()

        solvers.map { assertEquals(answer, it.twoNumberSum(array, targetSum), it.toString()) }
    }
}