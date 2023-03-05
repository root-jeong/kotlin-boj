import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val w = BufferedWriter(OutputStreamWriter(System.out))

    var line = readLine().split(' ').map { it.toInt() }
    val n = line[0]
    val m = line[1]
    val arr = MutableList(n + 1) { it }
    for (i in 0 until m) {
        line = readLine().split(' ').map { it.toInt() }
        val a = line[0]
        val b = line[1]
        var c = line[2]
        val tmpArr = mutableListOf<Int>()
        tmpArr.addAll(arr.subList(a, b + 1))
        for (j in a..b) {
            arr[j] = tmpArr[(c - a)]
            c++
            if (c > b) c = a
        }
    }

    w.write(arr.subList(1, n + 1).joinToString(" "))

    w.flush()
    w.close()
}
