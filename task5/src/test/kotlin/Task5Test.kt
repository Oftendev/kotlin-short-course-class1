import kotlin.test.Test
import kotlin.test.assertEquals

internal class Task5Test {

    @Test
    fun lastLocalMaxIndTest1() {
        assertEquals(5, lastLocalMaxInd(listOf(0,4,20,6,3,8,5,3)))
    }

    @Test
    fun moreTests() {
        assertEquals(-1, lastLocalMaxInd(listOf(0,0,0,0,0,0)))
    }

}