import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val w = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toBigInteger()
    w.write("${(n * (n - (1).toBigInteger()) * (n - (2).toBigInteger())) / (6).toBigInteger()}\n3")

    w.flush()
    w.close()
}
