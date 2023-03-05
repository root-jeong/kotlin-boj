import java.io.*
import kotlin.math.sqrt

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val w = BufferedWriter(OutputStreamWriter(System.out))


    val arr = MutableList(10001) { true }
    arr[1] = false

    for (i in 2 until 10001) {
        for (j in 2..sqrt(i.toDouble()).toInt()) {
            if (i % j == 0) arr[i] = false
        }
    }

    val a = readLine().toInt()
    val b = readLine().toInt()
    var total = 0
    val subList = arr.subList(a, b + 1)
    subList.mapIndexed { index, b -> if (b) total += (index + a) }
    val first = subList.indexOfFirst { it }

    if (first == -1) {
        w.write("-1\n")
    } else {
        w.write("${total}\n${first + a}\n")
    }

    w.flush()
    w.close()
}
