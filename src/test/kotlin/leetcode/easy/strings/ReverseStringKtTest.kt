package leetcode.easy.strings

import org.junit.Test

import org.junit.Assert.*
import kotlin.test.assertContentEquals

class ReverseStringKtTest {

    @Test
    fun reverseString() {
        val input = charArrayOf('H','a','n','n','a','h')
        val expected = charArrayOf('h','a','n','n','a','H')
        reverseString(input)
        assertContentEquals(expected, input)
    }
}