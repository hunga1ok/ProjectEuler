//https://projecteuler.net/problem=6
fun main() {
    val startms = System.currentTimeMillis()
    val start = System.nanoTime()
    val result = problem6()
    val time = System.nanoTime()-start
    println("result: $result \ntime: $time nano second")
    println("${System.currentTimeMillis()-startms} ms")
}

fun problem6(): Int {
    var sumOfSquare: Int = 0
    var sumOfNum: Int = 0
    for (i in 1..100) {
        sumOfNum += i
        sumOfSquare += i * i
    }
    return (sumOfNum * sumOfNum - sumOfSquare)
}