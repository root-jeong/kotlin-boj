import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val w = BufferedWriter(OutputStreamWriter(System.out))

    var max = -1
    var (a, b) = listOf(0, 0)
    for (i in 0 until 9) {
        readLine().split(' ').map { it.toInt() }.forEachIndexed { j, value ->
            if (max < value) {
                a = i
                b = j
                max = value
            }
        }
    }

    w.write("$max\n${a + 1} ${b + 1}\n")

    w.flush()
    w.close()
}
