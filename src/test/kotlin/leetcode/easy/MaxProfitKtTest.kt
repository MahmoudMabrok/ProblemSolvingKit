package leetcode.easy

import org.junit.Test
import kotlin.test.assertEquals

class MaxProfitKtTest {

    @Test
    fun maxProfit() {
        val data = intArrayOf(7,1,5,3,6,4)
        val actual = maxProfit(data)
        val expected = 5
        assertEquals(expected, actual)
    }
}