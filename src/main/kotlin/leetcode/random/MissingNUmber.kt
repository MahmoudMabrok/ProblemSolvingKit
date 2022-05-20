package leetcode.random

/**
 *
 * https://leetcode.com/problems/missing-number
 * 
 * @param nums IntArray
 * @return Int
 */
fun missingNumber(nums: IntArray): Int {
    val size = nums.size
    val totalSum =  (size * size + size) / 2
    val actualSum = nums.sum()
    return  totalSum  - actualSum
}