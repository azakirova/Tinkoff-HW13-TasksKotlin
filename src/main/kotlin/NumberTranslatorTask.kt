class NumberTranslatorTask {

    private val ones = listOf<String>(
        "один",
        "два",
        "три",
        "четыре",
        "пять",
        "шесть",
        "семь",
        "восемь",
        "девять",
        "десять",
        "одиннадцать",
        "двенадцать",
        "тринадцать",
        "четырнадцать",
        "пятнадцать",
        "шестнадцать",
        "семнадцать",
        "восемнадцать",
        "девятнадцать",
    )
    private val tens = listOf<String>(
        "",
        "двадцать",
        "тридцать",
        "сорок",
        "пятьдесят",
        "шестьдесят",
        "семьдесят",
        "восемьдесят",
        "девяносто"
    )
    private val hundreds = listOf<String>(
        "сто",
        "двести",
        "триста",
        "четыреста",
        "пятьсот",
        "шестьсот",
        "семьсот",
        "восемьсот",
        "девятьсот"
    )

    fun start() {
        print("Введите n от 0 до 1000: ")
        val n = readln().toIntOrNull()

        println(translate(n).capitalize())
    }

    private fun translate(arg: Int?): String {

        if (arg != null && arg > 0 && arg <= 1000) {
            if (arg == 1000) {
                return "Тысяча"
            }
            if (arg in 1..19) {
                return ones[arg - 1]
            }
            if (arg in 20..99) {
                return if (arg % 10 == 0) {
                    tens[arg / 10 - 1]
                } else {
                    val integer = arg / 10
                    val remainder = arg % 10
                    tens[integer] + " " + ones[remainder]
                }
            }
            if (arg in (100..999)) {
                return if (arg % 100 == 0) {
                    hundreds[arg / 100 - 1]
                } else {
                    val integer = arg / 100
                    val remainder = arg % 100
                    if (remainder in 1..19) {
                        hundreds[integer - 1] + " " + ones[remainder - 1]
                    } else {
                        val integerTens = remainder / 10
                        val remainderTens = remainder % 10
                        hundreds[integer - 1] + " " + tens[integerTens - 1] + " " + ones[remainderTens - 1]
                    }
                }
            }
        }
        return "Некорректный ввод"
    }
}