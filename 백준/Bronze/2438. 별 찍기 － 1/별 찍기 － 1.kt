import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val w = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    for (i in 0 until n) {
        for (j in 0..i) {
            w.write("*")
        }
        w.write("\n")
    }
    w.flush()
    w.close()
    close()
}
