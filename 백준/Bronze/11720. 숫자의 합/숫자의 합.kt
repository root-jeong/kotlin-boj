import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val w = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    var ans = 0
    readLine().forEach {
        ans += it.digitToInt()
    }

    w.write("$ans\n")

    w.flush()
    w.close()
}