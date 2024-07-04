fun sortByAge(namesAndAges: List<Pair<String, Int>>): List<Pair<String, Int>> {
    return namesAndAges.sortedBy { it.second }
}

fun main() {
    val namesAndAges = listOf(
        Pair("Alice", 30),
        Pair("Bob", 25),
        Pair("Charlie", 35),
        Pair("David", 28)
    )

    val sortedList = sortByAge(namesAndAges)
    sortedList.forEach { println("${it.first} - ${it.second}") }
}
