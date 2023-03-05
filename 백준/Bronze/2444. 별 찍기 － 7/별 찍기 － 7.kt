import java.io.*
import kotlin.math.abs

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val w = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    var startSpaceCnt = n - 1
    for (i in 0 until (2 * n - 1)) {
        for (j in 0 until abs(startSpaceCnt)) w.write(" ")
        for (j in 0 until (2 * n - 1) - (2 * abs(startSpaceCnt))) w.write("*")
        w.newLine()
        startSpaceCnt -= 1
    }

    w.flush()
    w.close()
}
