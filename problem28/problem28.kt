//https://projecteuler.net/problem=28
fun main() {

    val start = System.nanoTime()
    val result = problem28()
    val time = System.nanoTime()-start
    println("result: $result \ntime: $time nano second")
}

fun problem28(): Int {
    var space = 2
    var runner = 1
    var sum = 1
    while (space < 1001) {
        repeat(4) {
           runner += space
           sum += runner
        }
        space += 2
    }
    // println(sum)
    return sum
}



