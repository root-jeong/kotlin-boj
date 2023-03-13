import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val w = BufferedWriter(OutputStreamWriter(System.out))

    val (a1, a0) = readLine().split(' ').map { it.toInt() }
    val c = readLine().toInt()
    val n0 = readLine().toInt()

    if (((c - a1).toLong() * n0.toLong()) >= a0 && (c-a1) >= 0) {
        w.write("1")
    } else {
        w.write("0")
    }

    w.flush()
    w.close()
}
