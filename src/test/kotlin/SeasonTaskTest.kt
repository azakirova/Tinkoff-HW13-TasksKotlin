import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class SeasonTaskTest {

    @Test
    fun testSeasonTask(){
        val result = SeasonTask().getSeason(1)
        val result2 = SeasonTask().getSeason(2)
        val result3 = SeasonTask().getSeason(3)
        val result4 = SeasonTask().getSeason(4)
        val result5 = SeasonTask().getSeason(5)
        val result6 = SeasonTask().getSeason(6)
        val result7 = SeasonTask().getSeason(7)
        val result8 = SeasonTask().getSeason(8)
        val result9 = SeasonTask().getSeason(9)
        val result10 = SeasonTask().getSeason(10)
        val result11 = SeasonTask().getSeason(11)
        val result12 = SeasonTask().getSeason(12)

        Assertions.assertEquals("Зима", result)
        Assertions.assertEquals("Зима", result2)
        Assertions.assertEquals("Весна", result3)
        Assertions.assertEquals("Весна", result4)
        Assertions.assertEquals("Весна", result5)
        Assertions.assertEquals("Лето", result6)
        Assertions.assertEquals("Лето", result7)
        Assertions.assertEquals("Лето", result8)
        Assertions.assertEquals("Осень", result9)
        Assertions.assertEquals("Осень", result10)
        Assertions.assertEquals("Осень", result11)
        Assertions.assertEquals("Зима", result12)
    }
}