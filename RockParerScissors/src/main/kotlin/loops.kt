import kotlin.math.abs

fun main() {
    val a = 15
    val b = 1
    val step = 3
    val numbers = ArrayList<Int>(abs( a - b))

    for (i in a downTo b step step) {
        print("$i ")
        numbers.add(i)
    }
    println()

    for ((index, item) in numbers.withIndex()) {
        println("index=$index item=$item")
    }

}