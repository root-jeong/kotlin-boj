import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val w = BufferedWriter(OutputStreamWriter(System.out))

    val nums = readLine().split(' ').map { it.toInt() }
    val n = nums[0]
    val x = nums[1]

    readLine().split(' ').map { it.toInt() }.forEach {
        if (it < x) w.write("$it ")
    }

    w.newLine()
    w.flush()
    w.close()
    close()
}