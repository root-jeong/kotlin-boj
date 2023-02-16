fun main() = with(System.`in`.bufferedReader()) {
    val num = readLine().split(' ').map { it.toInt() }
    val a = num[0]
    val b = num[1]
    val c = readLine().toInt()

    val nowTotalM = (a * 60) + b
    val afterTotalM = (nowTotalM + c) % (24 * 60)

    val afterH = afterTotalM / 60
    val afterM = afterTotalM % 60

    print("$afterH $afterM")
}
