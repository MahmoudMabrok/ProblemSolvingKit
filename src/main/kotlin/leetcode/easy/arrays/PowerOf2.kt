package leetcode.easy.arrays

fun isPowerOfTwo(n: Int): Boolean {
    return if (n >= 0) n.toString(2).count{ it == '1'} == 1 else false
}
