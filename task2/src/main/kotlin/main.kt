/**
 * возвращает наименьшее из трёх заданных чисел
 */
fun min3(a: Int, b: Int, c: Int): Int {
    var min: Int = if(a > b) b else a
    min = if(min > c) c else min
    return min
}

fun main() {
    println(min3(2, 0, 3))
}