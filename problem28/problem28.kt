//https://projecteuler.net/problem=28
fun main() {
    val start = System.currentTimeMillis()
    problem28()
    println("${System.currentTimeMillis()-start} ms")
}

fun problem28() {
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
    println(sum)
}



