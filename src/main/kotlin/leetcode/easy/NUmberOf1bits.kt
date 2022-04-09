package leetcode.easy

/**
 *  NOT COMPLETED YET 
 * @param n Int
 * @return Int
 */

fun hammingWeight(n: Int): Int {
    return n.toString(2).count{ it == '1'}
}


fun main() {
    val x = -8
    println(x.toString(2))
}