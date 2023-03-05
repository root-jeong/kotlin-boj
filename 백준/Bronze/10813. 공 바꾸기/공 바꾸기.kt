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
        val tmp = arr[a]
        arr[a] = arr[b]
        arr[b] = tmp
    }

    for (i in 1..n) {
        w.write("${arr[i]} ")
    }


    w.flush()
    w.close()
}