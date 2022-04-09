package leetcode.easy

fun isPowerOfTwo(n: Int): Boolean {
    return if (n >= 0) n.toString(2).count{ it == '1'} == 1 else false
}


fun main() {
    val x = -8
    println(x.toString(2))
}