package leetcode.easy.arrays


fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
    val pairs =  if (nums1.size < nums2.size) nums1 to nums2 else nums2 to nums1
    return pairs.first.filter { first -> pairs.second.any { first == it } }.toIntArray()
}

