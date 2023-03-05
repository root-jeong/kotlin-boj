import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val w = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    for (i in 0 until n) {
        var line = readLine()
        w.write("${line.first()}${line.last()}\n")
    }

    w.flush()
    w.close()
}