import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class FactorialTaskTest {

    @Test
    fun testFactorialTask() {

        val result = FactorialTask().factorial(0)
        Assertions.assertEquals("1", result)

        val result2 = FactorialTask().factorial(1)
        Assertions.assertEquals("1", result2)

        val result3 = FactorialTask().factorial(2)
        Assertions.assertEquals("2", result3)

        val result4 = FactorialTask().factorial(4)
        Assertions.assertEquals("24", result4)

        val result5 = FactorialTask().factorial(100)
        Assertions.assertEquals(
            "93326215443944152681699238856266700490715968264381621468592963895217599993229915608941463976156518286253697920827223758251185210916864000000000000000000000000",
            result5
        )

        val result6 = FactorialTask().factorial(101)
        Assertions.assertEquals("Некорректный ввод", result6)

        val result7 = FactorialTask().factorial(-1)
        Assertions.assertEquals("Некорректный ввод", result7)
    }
}