fun main() = with(System.`in`.bufferedReader()) {
    var x = readLine().toInt()
    val n = readLine().toInt()
    for (i in 0 until n) {
        val nums = readLine().split(' ').map { it.toInt() }
        val a = nums[0]
        val b = nums[1]
        x -= a * b
    }
    print(if (x == 0) "Yes" else "No")
}
