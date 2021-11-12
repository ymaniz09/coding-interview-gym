package validateSubsequence

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test

internal class ValidateSubsequenceTest {

    companion object {
        lateinit var solvers: List<SubsequenceSolver>

        @BeforeAll
        @JvmStatic
        fun setUp() {
            solvers = listOf(
                Solution01(),
                Solution02()
            )
        }
    }

    @Test
    fun `test case 1`() {
        val array = listOf(5, 1, 22, 25, 6, -1, 8, 10)
        val sequence = listOf(1, 6, -1, 10)
        val answer = true

        solvers.map { assertEquals(answer, it.isValidSubsequence(array, sequence), it.toString()) }
    }

    @Test
    fun `test case 2`() {
        val array = listOf(5, 1, 22, 25, 6, -1, 8, 10)
        val sequence = listOf(5, 1, 22, 25, 6, -1, 8, 10)
        val answer = true

        solvers.map { assertEquals(answer, it.isValidSubsequence(array, sequence), it.toString()) }
    }

    @Test
    fun `test case 3`() {
        val array = listOf(5, 1, 22, 25, 6, -1, 8, 10)
        val sequence = listOf(5, 1, 22, 6, -1, 8, 10)
        val answer = true

        solvers.map { assertEquals(answer, it.isValidSubsequence(array, sequence), it.toString()) }
    }

    @Test
    fun `test case 4`() {
        val array = listOf(5, 1, 22, 25, 6, -1, 8, 10)
        val sequence = listOf(22, 25, 6)
        val answer = true

        solvers.map { assertEquals(answer, it.isValidSubsequence(array, sequence), it.toString()) }
    }

    @Test
    fun `test case 5`() {
        val array = listOf(5, 1, 22, 25, 6, -1, 8, 10)
        val sequence = listOf(1, 6, 10)
        val answer = true

        solvers.map { assertEquals(answer, it.isValidSubsequence(array, sequence), it.toString()) }
    }

    @Test
    fun `test case 6`() {
        val array = listOf(5, 1, 22, 25, 6, -1, 8, 10)
        val sequence = listOf(5, 1, 22, 10)
        val answer = true

        solvers.map { assertEquals(answer, it.isValidSubsequence(array, sequence), it.toString()) }
    }

    @Test
    fun `test case 7`() {
        val array = listOf(5, 1, 22, 25, 6, -1, 8, 10)
        val sequence = listOf(5, -1, 8, 10)
        val answer = true

        solvers.map { assertEquals(answer, it.isValidSubsequence(array, sequence), it.toString()) }
    }

    @Test
    fun `test case 8`() {
        val array = listOf(5, 1, 22, 25, 6, -1, 8, 10)
        val sequence = listOf(25)
        val answer = true

        solvers.map { assertEquals(answer, it.isValidSubsequence(array, sequence), it.toString()) }
    }

    @Test
    fun `test case 9`() {
        val array = listOf(1, 1, 1, 1, 1)
        val sequence = listOf(1, 1, 1)
        val answer = true

        solvers.map { assertEquals(answer, it.isValidSubsequence(array, sequence), it.toString()) }
    }

    @Test
    fun `test case 10`() {
        val array = listOf(5, 1, 22, 25, 6, -1, 8, 10)
        val sequence = listOf(5, 1, 22, 25, 6, -1, 8, 10, 12)
        val answer = false

        solvers.map { assertEquals(answer, it.isValidSubsequence(array, sequence), it.toString()) }
    }

    @Test
    fun `test case 11`() {
        val array = listOf(5, 1, 22, 25, 6, -1, 8, 10)
        val sequence = listOf(4, 5, 1, 22, 25, 6, -1, 8, 10)
        val answer = false

        solvers.map { assertEquals(answer, it.isValidSubsequence(array, sequence), it.toString()) }
    }

    @Test
    fun `test case 12`() {
        val array = listOf(5, 1, 22, 25, 6, -1, 8, 10)
        val sequence = listOf(5, 1, 22, 23, 6, -1, 8, 10)
        val answer = false

        solvers.map { assertEquals(answer, it.isValidSubsequence(array, sequence), it.toString()) }
    }

    @Test
    fun `test case 13`() {
        val array = listOf(5, 1, 22, 25, 6, -1, 8, 10)
        val sequence = listOf(5, 1, 22, 22, 25, 6, -1, 8, 10)
        val answer = false

        solvers.map { assertEquals(answer, it.isValidSubsequence(array, sequence), it.toString()) }
    }

    @Test
    fun `test case 14`() {
        val array = listOf(5, 1, 22, 25, 6, -1, 8, 10)
        val sequence = listOf(5, 1, 22, 22, 6, -1, 8, 10)
        val answer = false

        solvers.map { assertEquals(answer, it.isValidSubsequence(array, sequence), it.toString()) }
    }

    @Test
    fun `test case 15`() {
        val array = listOf(5, 1, 22, 25, 6, -1, 8, 10)
        val sequence = listOf(1, 6, -1, -1)
        val answer = false

        solvers.map { assertEquals(answer, it.isValidSubsequence(array, sequence), it.toString()) }
    }

    @Test
    fun `test case 16`() {
        val array = listOf(5, 1, 22, 25, 6, -1, 8, 10)
        val sequence = listOf(1, 6, -1, -1, 10)
        val answer = false

        solvers.map { assertEquals(answer, it.isValidSubsequence(array, sequence), it.toString()) }
    }

    @Test
    fun `test case 17`() {
        val array = listOf(5, 1, 22, 25, 6, -1, 8, 10)
        val sequence = listOf(1, 6, -1, -2)
        val answer = false

        solvers.map { assertEquals(answer, it.isValidSubsequence(array, sequence), it.toString()) }
    }

    @Test
    fun `test case 18`() {
        val array = listOf(5, 1, 22, 25, 6, -1, 8, 10)
        val sequence = listOf(26)
        val answer = false

        solvers.map { assertEquals(answer, it.isValidSubsequence(array, sequence), it.toString()) }
    }

    @Test
    fun `test case 19`() {
        val array = listOf(5, 1, 22, 25, 6, -1, 8, 10)
        val sequence = listOf(5, 1, 25, 22, 6, -1, 8, 10)
        val answer = false

        solvers.map { assertEquals(answer, it.isValidSubsequence(array, sequence), it.toString()) }
    }

    @Test
    fun `test case 20`() {
        val array = listOf(5, 1, 22, 25, 6, -1, 8, 10)
        val sequence = listOf(5, 26, 22, 8)
        val answer = false

        solvers.map { assertEquals(answer, it.isValidSubsequence(array, sequence), it.toString()) }
    }

    @Test
    fun `test case 21`() {
        val array = listOf(1, 1, 6, 1)
        val sequence = listOf(1, 1, 1, 6)
        val answer = false

        solvers.map { assertEquals(answer, it.isValidSubsequence(array, sequence), it.toString()) }
    }

    @Test
    fun `test case 22`() {
        val array = listOf(5, 1, 22, 25, 6, -1, 8, 10)
        val sequence = listOf(1, 6, -1, 10, 11, 11, 11, 11)
        val answer = false

        solvers.map { assertEquals(answer, it.isValidSubsequence(array, sequence), it.toString()) }
    }

    @Test
    fun `test case 23`() {
        val array = listOf(5, 1, 22, 25, 6, -1, 8, 10)
        val sequence = listOf(5, 1, 22, 25, 6, -1, 8, 10, 10)
        val answer = false

        solvers.map { assertEquals(answer, it.isValidSubsequence(array, sequence), it.toString()) }
    }
}