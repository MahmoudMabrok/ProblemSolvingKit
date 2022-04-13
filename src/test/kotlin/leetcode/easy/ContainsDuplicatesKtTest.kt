package leetcode.easy

import org.junit.Test

class ContainsDuplicatesKtTest {

    @Test
    fun containsDuplicate() {
        val input = intArrayOf(1,5,8,7,4,5,7,8,9)
        kotlin.test.assertEquals(true, leetcode.easy.arrays.containsDuplicate(input))
    }

    @Test
    fun containsDuplicate1() {
        val input = intArrayOf(1,5,8,7,4,5,7,8,9)
        kotlin.test.assertEquals(true, leetcode.easy.arrays.containsDuplicate1(input))
    }




}