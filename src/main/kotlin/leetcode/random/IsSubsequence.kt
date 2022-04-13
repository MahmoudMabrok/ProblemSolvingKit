package leetcode.random


fun isSubsequence(s: String, t: String): Boolean {
    val indexes = s.map { t.indexOf(it)}
    return indexes.any { it < 0 }.not() && indexes == indexes.sorted()
}


