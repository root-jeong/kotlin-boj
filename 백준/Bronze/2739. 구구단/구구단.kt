fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    for (i in 1..9) {
        println("$n * $i = ${i * n}")
    }
}
