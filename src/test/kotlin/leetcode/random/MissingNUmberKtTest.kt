package leetcode.random

import org.junit.Test

import org.junit.Assert.*

class MissingNUmberKtTest {

    @Test
    fun missingNumber() {
        val data = intArrayOf(0,2)
        val expected = 1
        val actual = missingNumber(data)
        assertEquals(expected, actual)
    }

    @Test
    fun missingNumber1() {
        val data = intArrayOf(9,6,4,2,3,5,7,0,1)
        val expected = 8
        val actual = missingNumber(data)
        assertEquals(expected, actual)
    }

    @Test
    fun missingNumber2() {
        val data = intArrayOf(0,1,2)
        val expected = 3
        val actual = missingNumber(data)
        assertEquals(expected, actual)
    }


}