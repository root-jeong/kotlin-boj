import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val w = BufferedWriter(OutputStreamWriter(System.out))

    val t = readLine().toInt()
    for(i in 0 until t) {
        val nums = readLine().split(' ').map { it.toInt() }
        val a = nums[0]
        val b = nums[1]
        w.write("${a + b}\n")
    }

    w.flush()
    w.close()
    close()
}
