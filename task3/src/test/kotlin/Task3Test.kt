import kotlin.math.PI
import kotlin.test.Test
import kotlin.test.assertEquals

class Task3Test {
    @Test
    fun deg2RadTest1() {
        assertEquals(PI, deg2rad(180.0), 1e-5)
        assertEquals(5.0 * PI, deg2rad(2*360 + 180.0), 1e-5)
    }

    @Test
    fun rad2DegTest1() {
        assertEquals(90.0, rad2deg(PI / 2), 1e-5)
    }

//    @Test
//    fun moreTests() {
//
//    }
}