import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val w = BufferedWriter(OutputStreamWriter(System.out))

    val nums = readLine().split(' ').map { it.toDouble() }
    val a = nums[0]
    val b = nums[1]
    val c = nums[2]

    val div = (c - b)
    if (div == 0.0 || (a / div) < 0) {
        w.write("-1\n")
    } else {
        w.write("${kotlin.math.abs(((a / div)).toInt() + 1)}\n")
    }

    w.flush()
    w.close()
}