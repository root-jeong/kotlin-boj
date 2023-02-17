import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val w = BufferedWriter(OutputStreamWriter(System.out))

    val t = readLine().toInt()
    for (i in 0 until t) {
        var ans = 0
        var curPoint = 0

        val s = readLine()

        s.forEach {
            if (it == 'O') {
                curPoint += 1
            } else {
                curPoint = 0
            }
            ans += curPoint
        }

        w.write("$ans\n")
    }

    w.flush()
    w.close()
}