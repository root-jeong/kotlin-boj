fun main() = with(System.`in`.bufferedReader()) {
    val a = readLine().toInt()

    when {
        a >= 90 -> {
            print("A")
        }
        a >= 80 -> {
            print("B")
        }
        a >= 70 -> {
            print("C")
        }
        a >= 60 -> {
            print("D")
        }
        else -> {
            print("F")
        }
    }
}
