import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val w = BufferedWriter(OutputStreamWriter(System.out))

    // start main Code

    val n = readLine().toInt()
    for (i in 0 until n) {
        for (j in 1 until (n - i)) {
            w.write(" ")
        }
        for (j in 0..i) {
            w.write("*")
        }
        w.write("\n")
    }

    // clear BufferedWriter
    w.flush()
    w.close()
    close()
}
