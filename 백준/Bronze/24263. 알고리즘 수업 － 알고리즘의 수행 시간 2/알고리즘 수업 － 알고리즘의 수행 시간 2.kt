import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val w = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    w.write("$n\n1")

    w.flush()
    w.close()
}
