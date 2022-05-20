package leetcode.easy.arrays

import org.junit.Test

import org.junit.Assert.*

class IntersectKtTest {

    @Test
    fun intersect() {
        val data1 = intArrayOf(6,4)
        val data2 = intArrayOf(7,1,5,3,6,4)
        val actual = intersect(data1, data2)
        val expected = intArrayOf(6, 4)
        assertArrayEquals(expected, actual)
    }
}