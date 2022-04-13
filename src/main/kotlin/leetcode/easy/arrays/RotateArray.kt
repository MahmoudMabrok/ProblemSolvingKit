package leetcode.easy.arrays

import kotlin.system.measureTimeMillis

fun rotateArray(nums: IntArray, k: Int) {
    val steps = (k % nums.size).also { println("steps :  $it") }
    val data =  nums.toMutableList()
    val startSplit = data.size - steps
    val final = (data.subList(startSplit , data.size) + data.subList(0 , startSplit)).also { println("final ${it[steps]}") }
    val m1 = measureTimeMillis {
        for (i in nums.indices){
            nums[i] = final[i]
        }
    }
    val m2 = measureTimeMillis {
        nums.forEachIndexed { index, i ->
            nums[index] = final[index]
        }
    }

    println("$m1 : $m2")

}
