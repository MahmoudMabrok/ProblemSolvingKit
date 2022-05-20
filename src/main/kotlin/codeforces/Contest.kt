package codeforces


fun main1() {
    val number = readLine()?.toInt() ?: 0
    val output = StringBuilder()
    for (i in 0 until number) {
        val num = readLine()?.toInt() ?: 0
        val res = when {
            num >= 1900 -> "Division 1"
            num >= 1600 -> "Division 2"
            num >= 1400 -> "Division 3"
            else -> "Division 4"
        }
        output.append(res)
        output.append("\n")
    }
    print(output.toString())
}

fun main() {
    val number = readLine()?.toInt() ?: 0
    val output = StringBuilder()
    for (i in 0 until number) {
        val num = readLine()?.toInt() ?: 0
        if (num < 3){
            output.append("-1\n")
            readLine()
            continue
        }
        val lists = (readLine()?: "").split(" ").map { it.toInt() }.groupBy { it }.filter { it.value.size >= 3 }.map { it.key }
        val out = if (lists.isEmpty()) "-1" else lists.joinToString(separator = " ")
        output.append("$out\n")
    }
    print(output.toString())
}

fun main3() {
    val number = readLine()?.toInt() ?: 0
    val output = StringBuilder()
    for (i in 0 until number) {
        val num = readLine()?.toInt() ?: 0
        val lists = (readLine()?: "").split(" ").map { it.toInt() }
        if (isAllSame(lists)){
            output.append("YES\n")
        }else {
            val odds =  lists.mapIndexed { index, i ->  if (index % 2 == 0 )  i + 1 else i}
            if (isAllSame(odds)){
                output.append("YES\n")
            }else{
                val evens =  lists.mapIndexed { index, i ->  if (index % 2 == 1 )  i + 1 else i}
                if (isAllSame(evens)){
                    output.append("YES\n")
                }else{
                    output.append("NO\n")
                }
            }
        }
    }
    print(output.toString())
}


fun isAllSame(lists: List<Int>): Boolean {
    return lists.all { it % 2 == 0 } or lists.all { it % 2 != 0 }
}





