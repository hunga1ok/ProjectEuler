//https://projecteuler.net/problem=1
fun main() {
    val start = System.nanoTime()
    val result = problem1()
    val time = System.nanoTime()-start
    println("result: $result \ntime: $time nano second")
}

fun problem1(): Int {
    var sum = 0
    var i = 3
    while (i < 1000) {
        sum += i
        i += 3
    }
    i = 5
    while (i < 1000) {
        if (i % 3 != 0) {
            sum += i
        }
        i += 5
    }
    return sum
}