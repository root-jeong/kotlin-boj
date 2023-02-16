fun main() = with(System.`in`.bufferedReader()) {
    val nums = readLine().split(" ").map { it.toInt() }
    val a = nums[0]
    val b = nums[1]
    when {
        a < b -> {
            print("<")
        }
        a > b -> {
            print(">")
        }
        else -> {
            print("==")
        }
    }
}
