package leetcode.contests.w268

import org.junit.Assert.assertEquals
import org.junit.Test

class FindDifferenceKtTest {

    @Test
    fun findDifference() {
        val l1 = intArrayOf(1, 2, 3, 3)
        val l2 = intArrayOf(1, 1, 2, 2)
        val result = findDifference(l1, l2)
        val expected = listOf(listOf(3) , emptyList())
        assertEquals(expected, result)

    }
}