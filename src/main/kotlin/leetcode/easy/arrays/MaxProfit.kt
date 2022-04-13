package leetcode.easy.arrays

/**
 * Not correct done
 * @param prices IntArray
 * @return Int
 */
fun maxProfit(prices: IntArray): Int {
    var maxDiff = 0
    for (i in 0 until prices.size - 1) {
        for (j in (i + 1) until (prices.size)) {
            if (prices[j] - prices[i] > maxDiff) {
                maxDiff = prices[j] - prices[i]
            }
        }
    }
    return maxDiff
}

