fun main(args: Array<String>) {
    println("1 - Определение времени года по месяцу")
    println("2 - Сортировка массива по отрицательным элементам")
    println("3 - Перевод числа в русский текст")
    println("4 - Вычисление факториала")
    println("Введите номер задачи: ")
    val numberTask = readln().toIntOrNull()
    if ((numberTask != null) && (numberTask >= 1) && (numberTask <= 4)){
        when (numberTask){
            1 -> SeasonTask().start()
            2 -> ArraySortTask().start()
            3 -> NumberTranslatorTask().start()
            4 -> FactorialTask().start()
        }
    }
    else println("Неверный ввод")
}