fun main() = with(System.`in`.bufferedReader()) {
    val a = readLine().toInt()

    var ret = false
    if (a % 4 == 0) {
        if (a % 100 != 0 || a % 400 == 0) {
            ret = true
        }
    }

    print(if (ret) "1" else "0")
}
