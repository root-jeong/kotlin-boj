import java.io.*
import kotlin.math.sqrt

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val w = BufferedWriter(OutputStreamWriter(System.out))

    val (a, b) = readLine().split(' ').map { it.toInt() }
    val arr = mutableListOf<Int>()
    for (i in 1..a) {
        if (a % i == 0) {
            arr.add(i)
        }
    }
    w.write("${arr.elementAtOrElse(b - 1) { 0 }}")

    w.flush()
    w.close()
}
