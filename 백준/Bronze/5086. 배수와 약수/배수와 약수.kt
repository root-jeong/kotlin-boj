import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val w = BufferedWriter(OutputStreamWriter(System.out))

    kotlin.run {
        while (true) {
            val (a, b) = readLine().split(' ').map { it.toInt() }
            if (a == 0 && b == 0) return@run
            w.write(
                if (b % a == 0) "factor"
                else if (a % b == 0) "multiple"
                else "neither"
            )
            w.newLine()
        }
    }

    w.flush()
    w.close()
}
