import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val w = BufferedWriter(OutputStreamWriter(System.out))


    val (n, m) = readLine().split(' ').map { it.toInt() }
    val arr = MutableList(n) { MutableList(m) { 0 } }
    for (i in 0 until 2) {
        for (j in 0 until n) {
            readLine().split(' ').map { it.toInt() }.forEachIndexed { k, value ->
                arr[j][k] += value
            }
        }
    }

    for (i in 0 until n) {
        for (j in 0 until m) {
            w.write("${arr[i][j]} ")
        }
        w.newLine()
    }

    w.flush()
    w.close()
}
