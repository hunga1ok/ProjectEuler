//https://projecteuler.net/problem=7
fun main() {
    val startms = System.currentTimeMillis()
    val start = System.nanoTime()
    val result = problem7()
    val time = System.nanoTime()-start
    println("result: $result \ntime: $time nano second")
    println("${System.currentTimeMillis()-startms} ms")
}

fun problem7(): Int {
    var listPrime = mutableListOf<Int>(2, 3)
    var count: Int = 2
    var current: Int = 3
    var check = current + 2
    while (count < 10001) {
        var isPrime = true
        for (i in listPrime) {
            if (i*i > check) break
            if (check % i == 0) {
                isPrime = false
                break
            }
        }
        if (isPrime) {
            listPrime.add(check)
            current = check
            count += 1
        }
        check += 2
    }

    return current
}