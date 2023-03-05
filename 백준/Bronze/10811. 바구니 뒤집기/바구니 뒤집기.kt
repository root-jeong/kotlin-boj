import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val w = BufferedWriter(OutputStreamWriter(System.out))

    var line = readLine().split(' ').map { it.toInt() }
    val n = line[0]
    val m = line[1]
    val arr = Array(n + 1) { it }

    for (i in 0 until m) {
        line = readLine().split(' ').map { it.toInt() }
        val a = line[0]
        val b = line[1]
        for (j in a..(a + b) / 2) {
            val target = b - (j - a)
            val tmp = arr[j]
            arr[j] = arr[target]
            arr[target] = tmp
        }
    }

    for (i in 1..n) {
        w.write("${arr[i]} ")
    }

    w.flush()
    w.close()
}