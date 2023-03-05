import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val w = BufferedWriter(OutputStreamWriter(System.out))

    val nums = readLine().split(' ').map { it.toLong() }
    w.write("${nums[0] + nums[1] + nums[2]}\n")

    w.flush()
    w.close()
}