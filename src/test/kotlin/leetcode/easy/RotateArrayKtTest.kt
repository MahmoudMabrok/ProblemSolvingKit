package leetcode.easy

import leetcode.easy.arrays.rotateArray
import leetcode.prepare
import org.junit.Test
import kotlin.test.assertContentEquals

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
