class ArraySortTask {
    fun start() {
        print("Введите числа через пробел: ")
        val array = readln().split(" ").mapNotNull { it.toIntOrNull() }
        if (sortNegatives(array).isEmpty()) {
            println("Введены некорректные значения")
        } else {
            println(sortNegatives(array))
        }
    }

    fun sortNegatives(arg: List<Int>): List<Int> {

        val negative = mutableListOf<Int>()
        val positive = mutableListOf<Int>()
        for (element in arg) {
            if (element < 0) {
                negative.add(element)
            } else {
                positive.add(element)
            }
        }
        return negative + positive
    }
}