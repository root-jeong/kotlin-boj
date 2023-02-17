import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val w = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    var curN = n
    var ans = 0
    do {
        curN = ((curN % 10) * 10) + ((((curN / 10) + (curN % 10))) % 10)
        ans += 1
    } while (curN != n)

    w.write("$ans\n")

    w.flush()
    w.close()
    close()
}