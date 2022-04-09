package leetcode.easy

fun containsDuplicate(nums: IntArray): Boolean {
    return nums.toSet().size != nums.size
}

fun containsDuplicate1(nums: IntArray): Boolean {
    return nums.groupBy { it }.size != nums.size
}

