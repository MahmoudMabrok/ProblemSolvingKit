package leetcode.easy.strings

fun reverseString(s: CharArray) {
    val iterations = s.size / 2
    val end = s.size
    for (i in 0..iterations){
        s[i] = s[end - i - 1].also { s[end - i - 1] = s[i] }
    }
}