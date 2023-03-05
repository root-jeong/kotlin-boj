import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val w = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt() / 4
    for(i in 0 until n) {
        w.write("long ")
    }
    w.write("int")

    w.flush()
    w.close()
}