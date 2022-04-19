package leetcode.contests.w289

fun digitSum(s: String, k: Int): String {
    var st = s
    while (st.length > k){
        st = st.windowed(k , step = k, partialWindows = true).map { sumString(it) }.joinToString(separator = "")
    }
    return st
}

fun sumString(st:String): Int {
    return st.map { "$it".toInt() }.sum()
}

fun main() {
    val st = "12345678"
    st.windowed(3 , step = 3, partialWindows = true).forEach {
        println(it)
    }

    println(sumString("4"))
    println(Integer.parseInt("4"))
}