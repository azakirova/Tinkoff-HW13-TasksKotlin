import java.math.BigInteger

class FactorialTask {

    fun start() {

        print("Введите n от 0 до 100: ")
        val n = readln().toIntOrNull()
        println(factorial(n))
    }

    private fun factorial(n: Int?): String {

        if (n != null && n >= 0 && n <= 100) {

            var factorial = BigInteger.ONE
            for (i in 2..n) {
                factorial = factorial.multiply(BigInteger.valueOf(i.toLong()))
            }
            return factorial.toString()
        }
        return "Некорректный ввод"
    }
}