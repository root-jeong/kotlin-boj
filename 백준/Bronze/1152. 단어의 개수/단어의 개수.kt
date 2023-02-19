import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val w = BufferedWriter(OutputStreamWriter(System.out))

    val arr = readLine().split(" ").filter { it.isNotEmpty() }
    w.write("${arr.size}\n")

    w.flush()
    w.close()
}