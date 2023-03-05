import java.io.*
import kotlin.math.sqrt

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val w = BufferedWriter(OutputStreamWriter(System.out))

    kotlin.run {
        while (true) {
            val n = readLine().toInt()
            if (n == -1) return@run

            val arr = mutableListOf<Int>()
            for (i in 1 until n) {
                if (n % i == 0) {
                    arr.add(i)
                }
            }
            if (arr.sum() == n) {
                w.write("$n = ${arr.joinToString(" + ")}")
            } else {
                w.write("$n is NOT perfect.")
            }
            w.newLine()
        }
    }

    w.flush()
    w.close()
}
