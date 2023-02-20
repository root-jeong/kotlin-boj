import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val w = BufferedWriter(OutputStreamWriter(System.out))

    val array = arrayOf("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=")

    var str = readLine()
    array.forEach {
        str = str.replace(it, "!")
    }
    w.write("${str.length}")


    w.flush()
    w.close()
}