import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val w = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    var ans = 0
    for (i in 0 until n) {
        val str = readLine()
        val arr = Array(26) { false }
        var isGroup = true
        str.forEachIndexed { index, c ->
            val code = c.code - 'a'.code
            if (!arr[code]) {
                arr[code] = true
            } else {
                if (index > 0) {
                    if (c != str[index - 1]) {
                        isGroup = false
                        return@forEachIndexed
                    }
                }
            }
        }
        if (isGroup) ans++
    }

    w.write("$ans\n")

    w.flush()
    w.close()
}