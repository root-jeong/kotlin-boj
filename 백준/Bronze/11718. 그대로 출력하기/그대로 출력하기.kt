import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val w = BufferedWriter(OutputStreamWriter(System.out))

    kotlin.run {
        while (true) {
            val line = readLine() ?: return@run
            w.write("$line\n")
        }
    }

    w.flush()
    w.close()
}