import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val w = BufferedWriter(OutputStreamWriter(System.out))

    readLine()
    val arr = readLine().split(' ').map { it.toInt() }
    w.write("${arr.minOf { it }} ${arr.maxOf { it }}")

    w.flush()
    w.close()
    close()
}