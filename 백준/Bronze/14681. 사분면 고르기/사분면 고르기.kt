fun main() = with(System.`in`.bufferedReader()) {
    val a = readLine().toInt()
    val b = readLine().toInt()

    if (a > 0) {
        if (b > 0) {
            print("1")
        } else {
            print("4")
        }
    } else {
        if (b > 0) {
            print("2")
        } else {
            print("3")
        }
    }
}
