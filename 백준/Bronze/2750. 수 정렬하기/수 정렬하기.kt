import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val w = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val list = mutableListOf<Int>()

    for (i in 0 until n) {
        val a = readLine().toInt()
        list.add(a)
    }

    list.sort()
    list.forEach {
        w.write("$it\n")
    }

    w.flush()
    w.close()
}
