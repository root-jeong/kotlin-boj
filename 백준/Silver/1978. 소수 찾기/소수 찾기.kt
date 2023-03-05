import java.io.*
import kotlin.math.sqrt

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val w = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val arr = MutableList(1001) { true }
    arr[1] = false

    for (i in 2 until 1001) {
        for (j in 2..sqrt(i.toDouble()).toInt()) {
            if (i % j == 0) arr[i] = false
        }
    }
    var ans = 0
    readLine().split(' ').map { it.toInt() }.forEachIndexed { index, c ->
        if (arr[c]) ans++
    }
    w.write("$ans\n")

    w.flush()
    w.close()
}
