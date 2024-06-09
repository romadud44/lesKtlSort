fun main() {
    /**
     * 1 Задание.  Создать класс Employee, в конструкторе передать свойства имени, возраста и зарплаты. Создать список
     * сотрудников, состоящий из 5 человек. Написать функции сортировки по именам, возрасту и зарплате.
     */
    println("\n***1 ЗАДАНИЕ***\n")
    val staff = listOf(
        Employee("Victor", 30, 100000),
        Employee("Anna", 25, 90000),
        Employee("Ivan", 28, 120000),
        Employee("Maria", 22, 75000)
    )
    val staffSortedByName = staff.sortedBy { it.name }
    println(staffSortedByName)
    val staffSortedByAge = staff.sortedBy { it.age }
    println(staffSortedByAge)
    val staffSortedBySalary = staff.sortedBy { it.salary }
    println(staffSortedBySalary)
    /**
     * 2 Задание.  Дана матрица целых чисел размерностью 3х4. Отсортировать ее строки по возрастанию.
     */
    println("\n***2 ЗАДАНИЕ***\n")

    val arrayOfNumbers = arrayOf(
        arrayOf(-5, 1, 21, -18),
        arrayOf(12, 5, -7, 16),
        arrayOf(7, 10, 9, 17)
    )
    println("Входные данные:")
    for (i in arrayOfNumbers.indices) {
        println(arrayOfNumbers[i].contentToString())
    }
    println("Результат:")
    val sortedListOfNumbers = sortedMatrix(arrayOfNumbers)
    for (i in sortedListOfNumbers.indices) {
        println(arrayOfNumbers[i].contentToString())
    }
    /**
     * 3 Задание.  Дана матрица целых чисел размерностью 3х4. Проверить, являются ли внутренние массивы матрицы
     * пилообразными, т.е. рядом с элементом массива находятся соседи большие или меньшие его. Необходимо вывести
     * количество пилообразных массивов и сами массивы.
     */
    println("\n***3 ЗАДАНИЕ***\n")

    val newArrayOfNumbers = arrayOf(
        arrayOf(6, 12, -4, 9),
        arrayOf(-5, 1, 21, -18),
        arrayOf(12, 5, -7, 16),
        arrayOf(7, 10, 9, 17)
    )
    var count = 0
    for (i in newArrayOfNumbers.indices) {
        var check = true
        for (j in 1..newArrayOfNumbers[i].size - 2) if (check) {
            if (((newArrayOfNumbers[i][j] > newArrayOfNumbers[i][j - 1]) && (newArrayOfNumbers[i][j] > newArrayOfNumbers[i][j + 1])) ||
                ((newArrayOfNumbers[i][j] < newArrayOfNumbers[i][j - 1]) && (newArrayOfNumbers[i][j] < newArrayOfNumbers[i][j + 1]))
            ) {
                check = true
            } else check = false
        }
        if (check) {
            println(newArrayOfNumbers[i].contentToString())
            count++
        }
    }
    println("Количество пилообразных массивов: $count")
}

//2
fun sortedMatrix(inputMatrix: Array<Array<Int>>): Array<Array<Int>> {
    for (i in inputMatrix.indices) {
        inputMatrix[i].sort()
    }
    return inputMatrix
}