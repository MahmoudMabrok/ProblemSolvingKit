package leetcode.contests.w268

fun findDifference(nums1: IntArray, nums2: IntArray): List<List<Int>> {
    val difff1 = nums1.toSet() - nums2.toSet()
    val difff2 = nums2.toSet() - nums1.toSet()
    return listOf(difff1.toList(), difff2.toList())
}

fun main() {
    val l1 = intArrayOf(1, 2, 3, 3)
    val l2 = intArrayOf(1, 1, 2, 2)
}