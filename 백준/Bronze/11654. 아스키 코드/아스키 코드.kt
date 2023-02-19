import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val c = readLine()
    w.write("${c[0].code}")
    w.flush()
    w.close()
}