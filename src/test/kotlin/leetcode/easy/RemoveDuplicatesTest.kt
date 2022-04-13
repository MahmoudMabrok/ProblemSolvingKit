package leetcode.easy

import leetcode.easy.arrays.RemoveDuplicates
import org.junit.Assert.assertEquals
import org.junit.Test

class RemoveDuplicatesTest {

    @Test
    fun removeDuplicates() {
        val input = intArrayOf(1, 1, 2, 2, 2, 2, 3)
        val actual = RemoveDuplicates().removeDuplicates(input)
        val expected = 3
        val expectedArray = intArrayOf(1, 2, 3)
        assertEquals(expected, actual)
        repeat(expected) {
            assertEquals(expectedArray[it], input[it])
        }
    }


    @Test
    fun removeDuplicates_2() {
        val input = intArrayOf(1, 2, 3)
        val actual = RemoveDuplicates().removeDuplicates(input)
        val expected = 3
        val expectedArray = intArrayOf(1, 2, 3)
        assertEquals(expected, actual)
        repeat(expected) {
            assertEquals(expectedArray[it], input[it])
        }
    }

    @Test
    fun removeDuplicates_3() {
        val input = intArrayOf(1, 1, 1, 1, 1)
        val actual = RemoveDuplicates().removeDuplicates(input)
        val expected = 1
        val expectedArray = intArrayOf(1)
        assertEquals(expected, actual)
        repeat(expected) {
            assertEquals(expectedArray[it], input[it])
        }
    }

}