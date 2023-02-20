import java.io.*
import kotlin.math.max

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val w = BufferedWriter(OutputStreamWriter(System.out))

    val strs = readLine().split(' ')
    println("${max(strs[0].reversed().toInt(), strs[1].reversed().toInt())}")

    w.flush()
    w.close()
}