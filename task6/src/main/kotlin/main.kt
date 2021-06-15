fun<T> assertCorrectMatrixSize(m: Array<Array<T>>) {
    assert(m.isNotEmpty())
    val cols = m[0].size
    for (row in m.indices.drop(1))
        assert(m[row].size == cols)
}

fun<T> assertSameSizeOfMatrices(m1: Array<Array<T>>, m2: Array<Array<T>>) {
    assertCorrectMatrixSize(m1)
    assertCorrectMatrixSize(m2)
    assert(m1.size == m2.size)
    assert(m1[0].size == m2[0].size)
}

fun<T> createMatrixOfSameSize(m: Array<Array<T>>, default: T): Array<Array<T>> {
    assertCorrectMatrixSize(m)
    val res = m.clone()
    for(row in res.indices)
        for(col in res[row].indices)
            res[row][col] = default
    return res
}

fun<T> printMatrix(m: Array<Array<T>>) {
    for(i in m.indices){
        for(k in m[0].indices){
            print("${m[i][k]} ")
        }
        println()
    }
}

fun sumOfMatrices(m1: Array<Array<Int>>, m2: Array<Array<Int>>): Array<Array<Int>> {
    assertSameSizeOfMatrices(m1, m2)
    val res = Array(m1.lastIndex + 1, {Array(m1[0].lastIndex + 1, {0})})
    for(i in m1.indices){
        for(k in m1[0].indices){
            res[i][k] = m1[i][k] + m2[i][k]
        }
    }
    return res
}

fun main() {
    val m: Array<Array<Int>> = arrayOf(
        arrayOf(1,0,0),
        arrayOf(0,1,0),
        arrayOf(0,0,1)
    )


    printMatrix(sumOfMatrices(m, m))
}