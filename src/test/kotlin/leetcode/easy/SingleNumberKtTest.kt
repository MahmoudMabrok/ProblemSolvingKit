package leetcode.easy

import org.junit.Test

import org.junit.Assert.*

class SingleNumberKtTest {

    @Test
    fun singleNumber() {
        val nums = intArrayOf(1,2,1,2,3)
        val expected = 3
        val actual = singleNumber(nums)
        assertEquals(expected, actual)
    }

    @Test
    fun singleNumber_2() {
        val nums = intArrayOf(1,2,1)
        val expected = 2
        val actual = singleNumber(nums)
        assertEquals(expected, actual)
    }


}