import kotlin.test.Test
import kotlin.test.assertEquals

class Task2Test {
    @Test
    fun min3Test1() {
        assertEquals(0, min3(2, 0, 3))
    }

    @Test
    fun min3Test2() {
        assertEquals(2, min3(2, 2, 5))
    }

    @Test
    fun min3Test3() {
        assertEquals(0, min3( 0, 0, 0))
    }

    @Test
    fun min3Test4() {
        assertEquals(-5, min3(-2, -5, -5))
    }

    @Test
    fun min3Test5() {
        assertEquals(2, min3(5, 2, 5))
    }

}