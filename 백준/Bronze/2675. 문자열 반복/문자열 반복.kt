import java.io.*


fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val w = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()

    for (i in 0 until n) {
        val line = readLine().split(' ')
        val r = line[0].toInt()
        val str = line[1]
        str.forEach {
            for (j in 0 until r) {
                w.write("$it")
            }
        }
        w.newLine()
    }

    w.flush()
    w.close()
}