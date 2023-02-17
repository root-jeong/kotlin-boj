import java.io.*

val arr: Array<Int> = Array(202) { 0 }

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val w = BufferedWriter(OutputStreamWriter(System.out))

    readLine().toInt()
    readLine().split(' ').map { it.toInt() }.forEach { t ->
        arr[t + 100] += 1
    }
    val v = readLine().toInt()
    w.write("${arr[v + 100]}\n")

    w.flush()
    w.close()
    close()
}