import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class NumberTranslatorTaskTest {

    @Test
    public fun testNumberTranslatorTaskThousand(){
        val result = NumberTranslatorTask().translate(1000)
        Assertions.assertEquals("тысяча", result)
    }
    @Test
    public fun testNumberTranslatorTaskHundreds(){
        val result = NumberTranslatorTask().translate(100)
        Assertions.assertEquals("сто", result)

        val result2 = NumberTranslatorTask().translate(112)
        Assertions.assertEquals("сто двенадцать", result2)

        val result3 = NumberTranslatorTask().translate(121)
        Assertions.assertEquals("сто двадцать один", result3)

        val result4 = NumberTranslatorTask().translate(999)
        Assertions.assertEquals("девятьсот девяносто девять", result4)
    }
    @Test
    public fun testNumberTranslatorTaskTens(){
        val result = NumberTranslatorTask().translate(20)
        Assertions.assertEquals("двадцать", result)

        val result2 = NumberTranslatorTask().translate(99)
        Assertions.assertEquals("девяносто девять", result2)
    }
    @Test
    public fun testNumberTranslatorTaskOnes(){
        val result = NumberTranslatorTask().translate(1)
        Assertions.assertEquals("один", result)

        val result2 = NumberTranslatorTask().translate(9)
        Assertions.assertEquals("девять", result2)
    }
    @Test
    public fun testNumberTranslatorTaskTeens(){
        val result = NumberTranslatorTask().translate(11)
        Assertions.assertEquals("одиннадцать", result)

        val result2 = NumberTranslatorTask().translate(19)
        Assertions.assertEquals("девятнадцать", result2)
    }

    @Test
    public fun testNumberTranslatorTaskNull(){
        val result = NumberTranslatorTask().translate(0)
        Assertions.assertEquals("Некорректный ввод", result)

        val result2 = NumberTranslatorTask().translate(null)
        Assertions.assertEquals("Некорректный ввод", result2)
    }
}