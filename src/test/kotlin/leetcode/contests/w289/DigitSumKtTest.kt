package leetcode.contests.w289

import org.junit.Test

import org.junit.Assert.*

class DigitSumKtTest {

    @Test
    fun digitSum() {
        val st = "00000000"
        val k = 3
        val actual = digitSum(st , k)
        val expected = "000"
        assertEquals(expected, actual)
    }
}