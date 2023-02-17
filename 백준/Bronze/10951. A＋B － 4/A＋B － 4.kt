import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val w = BufferedWriter(OutputStreamWriter(System.out))

    // start main Code
    while (true) {
        val line = readLine() ?: break
        val nums = line.split(' ').map { it.toInt() }
        val a = nums[0]
        val b = nums[1]
        w.write("${a + b}\n")
    }

    // clear BufferedWriter
    w.flush()
    w.close()
    close()
}
