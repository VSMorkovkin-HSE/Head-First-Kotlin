class Rectangle(var width: Int, var height: Int) {
    val isSquare: Boolean
        get() = (width == height)

    val area: Int
        get() = (width * height)
}

fun main() {
    val r = arrayOf(
        Rectangle(1, 1),
        Rectangle(1, 1),
        Rectangle(1, 1),
        Rectangle(1, 1)
    )

    for (x in 0 until r.size) {
        r[x].width = (x + 1) * 3
        r[x].height = x + 5
        print("Rectangle $x w=${r[x].width} h=${r[x].height} has area ${r[x].area}. ")
        println("Is is ${if (r[x].isSquare) "" else "not"}a square.")
    }
}