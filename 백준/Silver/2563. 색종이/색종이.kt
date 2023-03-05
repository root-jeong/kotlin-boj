import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val w = BufferedWriter(OutputStreamWriter(System.out))

    val arr = MutableList(101) { MutableList(101) { false } }
    val n = readLine().toInt()
    var ans = 0
    for (i in 0 until n) {
        val (x, y) = readLine().split(' ').map { it.toInt() }
        for (j in x until (x + 10)) {
            for (k in y until (y + 10)) {
                if (!arr[j][k]) {
                    ans += 1
                    arr[j][k] = true
                }
            }
        }
    }

    w.write("${ans}\n")

    w.flush()
    w.close()
}
