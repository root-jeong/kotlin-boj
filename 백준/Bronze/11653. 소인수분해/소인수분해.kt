import java.io.*
import kotlin.math.sqrt

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val w = BufferedWriter(OutputStreamWriter(System.out))

    var n = readLine().toInt()
    var s = 2

    while (n > 1) {
        if (n % s == 0) {
            w.write("$s\n")
            n /= s
        } else s++
    }

    w.flush()
    w.close()
}
