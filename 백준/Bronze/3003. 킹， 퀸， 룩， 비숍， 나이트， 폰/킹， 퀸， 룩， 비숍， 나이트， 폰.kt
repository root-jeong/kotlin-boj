import java.util.Scanner

val list = listOf(
    1, 1, 2, 2, 2, 8
)

fun main() = with(Scanner(System.`in`)) {
    for(i in 0..5) {
        val a = nextInt()
        println(list[i] - a)
    }
}