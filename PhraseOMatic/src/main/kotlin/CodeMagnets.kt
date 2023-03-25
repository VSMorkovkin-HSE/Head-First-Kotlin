fun main() {
    val fruit = arrayOf("Apple", "Banana", "Chery", "Blueberry", "Pomegranate")
    val index = arrayOf(1, 3, 4, 2)
    var x = 0
    var y: Int

    while (x < index.size) {
        y = index[x]
        println("Fruit = ${fruit[y]}")
        x += 1
    }
}