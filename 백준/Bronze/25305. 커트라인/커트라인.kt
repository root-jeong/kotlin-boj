import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val w = BufferedWriter(OutputStreamWriter(System.out))

    val list = mutableListOf<Int>()
    val (N, k) = readLine().split(' ').map { it.toInt() }
    readLine().split(' ').forEach {
        list.add(it.toInt())
    }
    list.sortDescending()
    w.write("${list[k - 1]}")

    w.flush()
    w.close()
}
