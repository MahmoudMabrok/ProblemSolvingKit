package hackerrank_prep.warm

/*
 * Complete the 'jumpingOnClouds' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY c as parameter.
 */
fun jumpingOnClouds(c: Array<Int>): Int {
    // Write your code here
    var steps = 0
    var current = 0
    while (current < c.size - 1) {
        val isRange = current + 2 <= c.size - 1
        current += if (isRange && c[current + 2] != 1) 2 else 1
        steps += 1
    }
    return steps
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val c = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = jumpingOnClouds(c)

    println(result)
}