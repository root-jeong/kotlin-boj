fun main() = with(System.`in`.bufferedReader()) {
    val a = readLine().toInt()
    val b = readLine()
    for(i in 2 downTo 0) {
        println((b[i].toInt() - ('0').toInt()) * a)
    }
    print(a * b.toInt())
}