import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test


class ArraySortTaskTest {
    @Test
    public fun testSortNegatives() {
        val list = listOf<Int>(1, 0, -5, -2, 77)
        val expected = listOf<Int>(-5, -2, 1, 0, 77)
        val result = ArraySortTask().sortNegatives(list)
        Assertions.assertEquals(expected, result)
    }
    @Test
    public fun testSortNegativesPositiveNumbers() {
        val list = listOf<Int>(1, 0, 5, 2, 77)
        val expected = listOf<Int>(1, 0, 5, 2, 77)
        val result = ArraySortTask().sortNegatives(list)
        Assertions.assertEquals(expected, result)
    }
    @Test
    public fun testSortNegativesEmptyArray() {
        val list = listOf<Int>()
        val expected = listOf<Int>()
        val result = ArraySortTask().sortNegatives(list)
        Assertions.assertEquals(expected, result)
    }
}