import java.util.Collections.max

fun main() = with(System.`in`.bufferedReader()) {
    val num = readLine().split(' ').map { it.toInt() }
    if (num[0] == num[1] && num[1] == num[2] && num[2] == num[0]) {
        print(num[1] * 1000 + 10000)
    } else if (num[0] == num[1]) {
        print(num[0] * 100 + 1000)
    } else if (num[1] == num[2]) {
        print(num[1] * 100 + 1000)
    } else if (num[2] == num[0]) {
        print(num[2] * 100 + 1000)
    } else {
        print(max(num) * 100)
    }
}
