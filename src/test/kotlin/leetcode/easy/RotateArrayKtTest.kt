package leetcode.easy

import leetcode.data1
import leetcode.expectedArray1
import leetcode.prepare
import org.junit.Test
import kotlin.system.measureNanoTime
import kotlin.system.measureTimeMillis
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class RotateArrayKtTest {

    @Test
    fun rotateArray1() {
        val data = intArrayOf(7,1,5,3,6,4)
        val expectedArray = intArrayOf(4,7,1,5,3,6)
        rotateArray(data , 1)
        assertContentEquals(expectedArray, data)
    }

    @Test
    fun rotateArray2() {
        val d = prepare()
        rotateArray(d.first, 11939)
        assertContentEquals(d.second, d.first)
    }
}
