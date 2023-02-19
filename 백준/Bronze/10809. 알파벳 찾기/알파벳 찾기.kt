import java.io.*

val arr = Array(26) { -1 }

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val w = BufferedWriter(OutputStreamWriter(System.out))

    readLine().forEachIndexed { index, c ->
        val arrIndex = c - 'a'
        if (arr[arrIndex] == -1) {
            arr[arrIndex] = index
        }
    }

    w.write("${arr.joinToString(" ")}\n")

    w.flush()
    w.close()
}