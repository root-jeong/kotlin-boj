import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val w = BufferedWriter(OutputStreamWriter(System.out))

    val t = readLine().toInt()
    for (i in 0 until t) {
        val nums = readLine().split(' ').map { it.toInt() }
        val N = nums[0]
        var S = nums.subList(1, nums.size)

        val average = S.average()
        val count = S.count { it > average }

        w.write("${String.format("%.3f", ((count.toDouble() / N) * 100))}%\n")
    }



    w.flush()
    w.close()
}