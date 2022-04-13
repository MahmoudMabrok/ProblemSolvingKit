package leetcode.random

import org.junit.Test

import org.junit.Assert.*

class IsSubsequenceKtTest {

    @Test
    fun isSubsequence() {
        val sub = "abc"
        val word = "awwewbnnnc"
        val actual = isSubsequence(sub, word)
        val expected = true
        assertEquals(expected, actual) // or  assertTrue(actual)
    }

    @Test
    fun isSubsequence_fail() {
        val sub = "acb"
        val word = "awwewbnnnc"
        val actual = isSubsequence(sub, word)
        val expected = false
        assertEquals(expected, actual) // or  assertTrue(actual)
    }

    @Test
    fun isSubsequence_fail_not() {
        val sub = "y"
        val word = "awwewbnnnc"
        val actual = isSubsequence(sub, word)
        val expected = false
        assertEquals(expected, actual) // or  assertTrue(actual)
    }

    @Test
    fun isSubsequence_fail_not1() {
        val sub = "atb"
        val word = "awwewbnnnc"
        val actual = isSubsequence(sub, word)
        val expected = false
        assertEquals(expected, actual) // or  assertTrue(actual)
    }


}