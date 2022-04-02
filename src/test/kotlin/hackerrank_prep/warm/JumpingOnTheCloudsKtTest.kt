package hackerrank_prep.warm

import org.junit.Assert.assertEquals
import org.junit.Test

class JumpingOnTheCloudsKtTest {

    @Test
    fun jumpingOnClouds_1() {
        val list = arrayOf(0 ,0 ,1 ,0 ,0 ,1,0)
        val expected = 4
        val actual = jumpingOnClouds(list)
        assertEquals(expected, actual)
    }

    @Test
    fun jumpingOnClouds_2() {
        val list = arrayOf(0, 0, 0, 0, 1, 0)
        val expected = 3
        val actual = jumpingOnClouds(list)
        assertEquals(expected, actual)
    }

    @Test
    fun jumpingOnClouds_3() {
        val list = arrayOf(0, 0, 0, 1, 0, 0)
        val expected = 3
        val actual = jumpingOnClouds(list)
        assertEquals(expected, actual)
    }

}