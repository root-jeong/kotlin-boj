import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val w = BufferedWriter(OutputStreamWriter(System.out))

    val arr = Array(26) { 0 }
    var count: Int
    var cur = 2
    var cirCount = 0

    for (i in 0 until 26) {
        arr[i] = cur

        val code = i + 'A'.code
        count = if (code == 'R'.code || code == 'Y'.code) {
            4
        } else {
            3
        }

        cirCount++
        if (count <= cirCount) {
            cirCount = 0
            cur++
        }
    }

    var ans = 0
    readLine().forEach {
        ans += arr[it.code - 'A'.code] + 1
    }

    w.write("$ans")


    w.flush()
    w.close()
}