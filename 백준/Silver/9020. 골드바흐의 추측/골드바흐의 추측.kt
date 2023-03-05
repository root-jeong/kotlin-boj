import java.io.*
import java.lang.Math.abs

const val MAX_N = 10_001

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val w = BufferedWriter(OutputStreamWriter(System.out))


    val arr = MutableList(MAX_N) { -1 }
    var sosuList = mutableListOf<Int>()

    for (i in 2 until MAX_N) {
        if (arr[i] == -1) {
            arr[i] = 1
            sosuList.add(i)
            var j = 2
            while (i * j < MAX_N) {
                arr[i * j] = 0
                j++
            }
        }
    }

    var t = readLine().toInt()
    for (i in 0 until t) {
        val n = readLine().toInt()
        val insertedIndex = sosuList.binarySearch(n / 2)
        var startIndex = if (insertedIndex < 0) {
            kotlin.math.abs(insertedIndex) - 2
        } else {
            insertedIndex
        }

        while (startIndex >= 0) {
            if (arr[n - sosuList[startIndex]] == 1) {
                w.write("${sosuList[startIndex]} ${n - sosuList[startIndex]}\n")
                break
            }
            startIndex--
        }
    }

    w.flush()
    w.close()
}
