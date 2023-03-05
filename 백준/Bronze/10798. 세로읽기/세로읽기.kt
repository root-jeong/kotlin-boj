import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val w = BufferedWriter(OutputStreamWriter(System.out))

    val arr = MutableList(15) { MutableList(15) { ' ' } }
    for (i in 0 until 5) {
        readLine().forEachIndexed { j, c ->
            arr[i][j] = c
        }
    }

    for (j in 0 until 15) {
        for (i in 0 until 5) {
            if (arr[i][j] == ' ') continue
            w.write("${arr[i][j]}")
        }
    }

    w.flush()
    w.close()
}
