fun main() = with(System.`in`.bufferedReader()) {
    val t = readLine().toInt()
    for (i in 0 until t) {
        val nums = readLine().split(' ').map { it.toInt() }
        val a = nums[0]
        val b = nums[1]
        println(a + b)
    }
}
