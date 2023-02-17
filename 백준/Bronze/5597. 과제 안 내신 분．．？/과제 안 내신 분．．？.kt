import java.io.*

val arr = Array(31) { false }

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val w = BufferedWriter(OutputStreamWriter(System.out))

    for (i in 0 until 28) {
        val a = readLine().toInt()
        arr[a] = true
    }

    for (i in 1..30) {
        if (!arr[i]) w.write("$i\n")
    }

    w.flush()
    w.close()
}