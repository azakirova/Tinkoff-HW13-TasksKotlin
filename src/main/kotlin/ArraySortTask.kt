class ArraySortTask {

    private fun sortNegatives(arg: List<Int>): List<Int> {

        val negative = mutableListOf<Int>()
        val positive = mutableListOf<Int>()
        for (element in arg){
            if (element < 0){
                negative.add(element)
            }
            else{
                positive.add(element)
            }
        }
        return negative + positive
    }

    fun start() {
        print("Введите числа через пробел: ")
        val array = readln().split(" ").mapNotNull { it.toIntOrNull() }
        println(sortNegatives(array))
    }

}