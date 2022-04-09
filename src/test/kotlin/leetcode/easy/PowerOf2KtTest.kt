package leetcode.easy

import org.junit.Test

import org.junit.Assert.*

class PowerOf2KtTest {

    @Test
    fun isPowerOfTwo() {
        val actual = isPowerOfTwo(12)
        assertEquals(false, actual)
    }

    @Test
    fun isPowerOfTwo_caseTrue() {
        val actual = isPowerOfTwo(1)
        assertEquals(true, actual)
    }

    @Test
    fun isPowerOfTwo_caseTrueNoN1() {
        val actual = isPowerOfTwo(4)
        assertEquals(true, actual)
    }

    @Test
    fun isPowerOfTwo_caseNegative() {
        val actual = isPowerOfTwo(-4)
        assertEquals(false, actual)
    }


}