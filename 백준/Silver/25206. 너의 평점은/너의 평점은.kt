import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val w = BufferedWriter(OutputStreamWriter(System.out))

    val scoreMap = mapOf(
        Pair("A+", 4.5),
        Pair("A0", 4.0),
        Pair("B+", 3.5),
        Pair("B0", 3.0),
        Pair("C+", 2.5),
        Pair("C0", 2.0),
        Pair("D+", 1.5),
        Pair("D0", 1.0),
        Pair("F", 0.0),
    )

    var total = 0.0
    var div = 0.0
    for (i in 0 until 20) {
        val line = readLine().split(' ')
        val aScore = line[1].toDouble()
        scoreMap[line[2]]?.let { bScore ->
            total += aScore * bScore
            div += aScore
        }
    }
    w.write("${total / div}")

    w.flush()
    w.close()
}
