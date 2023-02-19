import java.io.*

val arr = Array(26) { 0 }

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val w = BufferedWriter(OutputStreamWriter(System.out))

    val s = readLine()

    s.forEach {
        val arrIndex = if (it >= 'a') it - 'a' else it - 'A'
        arr[arrIndex] += 1
    }

    val maxCnt = arr.maxOf { it }
    val count = arr.count { it == maxCnt }
    if (count > 1) {
        w.write("?")
    } else {
        w.write("${arr.indexOf(maxCnt).toChar() + 'A'.code}")
    }

    w.flush()
    w.close()
}