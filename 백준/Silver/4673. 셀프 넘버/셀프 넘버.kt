import java.io.*
import kotlin.math.log10

val arr = Array(10001) { false }


fun d(n: Int) {
    if (n > 10000 || arr[n]) return
    arr[n] = true

    var input = n
    var nextN = 0

    while (input != 0) {
        nextN += input % 10
        input /= 10
    }
    nextN += n
    d(nextN)
}

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val w = BufferedWriter(OutputStreamWriter(System.out))

    for (startNum in 1..10000) {
        if (!arr[startNum]) {
            w.write("$startNum\n")
            d(startNum)
        }
    }

    w.flush()
    w.close()
}