fun main() = with(System.`in`.bufferedReader()) {
    val num = readLine().split(' ').map { it.toInt() }
    val h = num[0]
    val m = num[1]

    var totalM = h * 60 + m - 45
    totalM %= 60 * 24
    if (totalM < 0) {
        totalM += (60 * 24)
    }

    val mm = totalM % 60
    val hh = totalM / 60
    print("$hh $mm")
}
