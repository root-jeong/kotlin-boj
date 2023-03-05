import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val w = BufferedWriter(OutputStreamWriter(System.out))

    val line = readLine().split(' ').map{ it.toInt() }
    val n = line[0]
    val m = line[1]
    val arr = Array(n + 1){ 0 }

    for(i in 0 until m) {
        val line = readLine().split(' ').map { it.toInt() }
        val i = line[0]
        val j = line[1]
        val k = line[2]
        for(ii in i..j) {
            arr[ii] = k
        }
    }

    for(i in 1..n) {
        w.write("${arr[i]} ")
    }

    w.flush()
    w.close()
}