import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val w = BufferedWriter(OutputStreamWriter(System.out))

    kotlin.run {
        while (true) {
            val (a, b) = readLine().split(' ').map { it.toInt() }
            var ret = ' '
            if (a == 0 && b == 0) return@run
            ret = if (a < b) {
                if (b % a == 0) 'f'
                else 'n'
            } else {
                if (a % b == 0) 'm'
                else 'n'
            }
            when (ret) {
                'f' -> w.write("factor\n")
                'm' -> w.write("multiple\n")
                'n' -> w.write("neither\n")
            }
        }
    }

    w.flush()
    w.close()
}
