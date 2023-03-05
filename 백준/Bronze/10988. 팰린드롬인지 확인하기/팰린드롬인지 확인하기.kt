import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val w = BufferedWriter(OutputStreamWriter(System.out))

    val line = readLine()
    val length = line.length
    var ret = true
    for(i in 0 until length / 2) {
        if (line[i] != line[length - 1 - i]) ret = false
    }

    w.write("${if (ret) 1 else 0}")

    w.flush()
    w.close()
}
