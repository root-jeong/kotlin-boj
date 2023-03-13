import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val w = BufferedWriter(OutputStreamWriter(System.out))

    val list = mutableListOf<Int>()

    for (i in 0 until 5) {
        val a = readLine().toInt()
        list.add(a)
    }

    list.sort()
    val avg = list.average().toInt()
    val mid = list[list.size / 2]
    w.write("$avg\n$mid")

    w.flush()
    w.close()
}
