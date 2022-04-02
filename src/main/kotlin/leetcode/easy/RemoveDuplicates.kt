package leetcode.easy

class RemoveDuplicates {

    /**
     * remove duplicate in-place array.
     * @param nums IntArray
     * @return Int
     *
     *
     */
    fun removeDuplicates(nums: IntArray): Int {
        var i = 0
        var count = 1
        for (j in 1 until nums.size) {
            if (nums[j] != nums[i]) {
                nums[i + 1] = nums[j]
                i += 1
                count += 1
            }
        }
        return count
    }

    fun removeDuplicatesUsingSet(nums: IntArray): Int {
        var i = 0
        var count = 1
        for (j in 1 until nums.size) {
            if (nums[j] != nums[i]) {
                nums[i + 1] = nums[j]
                i += 1
                count += 1
            }
        }
        return count
    }


}