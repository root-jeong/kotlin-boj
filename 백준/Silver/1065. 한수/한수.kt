import java.io.*
import kotlin.math.log10

val arr = Array(10001) { false }

fun isArithmeticSequenceNum(n: Int): Boolean {
    val strN = n.toString()
    var d = -1
    var ret = true
    run {
        strN.forEachIndexed { index, c ->
            if (index == 0) {
                return@forEachIndexed
            } else if (index == 1) {
                d = c - strN[index - 1]
            } else {
                if (d != c - strN[index - 1]) {
                    ret = false
                    return@run
                }
            }
        }
    }
    return ret
}

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val w = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    var ans = 0
    for (i in 1..n) {
        if (isArithmeticSequenceNum(i)) {
            ans++
        }
    }

    w.write("$ans\n")

    w.flush()
    w.close()
}