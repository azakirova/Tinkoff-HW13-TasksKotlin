class SeasonTask {

    private val seasons = mapOf(
        1 to "Зима",
        2 to "Зима",
        3 to "Весна",
        4 to "Весна",
        5 to "Весна",
        6 to "Лето",
        7 to "Лето",
        8 to "Лето",
        9 to "Осень",
        10 to "Осень",
        11 to "Осень",
        12 to "Зима"
    )

    fun start() {
        print("Введите месяц от 1 до 12: ")
        val month = readln().toIntOrNull()

        println(getSeason(month))
    }

    fun getSeason(arg: Int?): String {
        return if (arg != null && arg >= 1 && arg <= 12) {
            seasons[arg]!!
        } else {
            "Некорректный ввод"
        }
    }
}