package leetcode.easy

import org.junit.Test

import org.junit.Assert.*
import kotlin.test.assertContentEquals

class ContainsDuplicatesKtTest {

    @Test
    fun containsDuplicate() {
        val input = intArrayOf(1,5,8,7,4,5,7,8,9)
        kotlin.test.assertEquals(true, containsDuplicate(input))
    }

    @Test
    fun containsDuplicate1() {
        val input = intArrayOf(1,5,8,7,4,5,7,8,9)
        kotlin.test.assertEquals(true, containsDuplicate1(input))
    }




}