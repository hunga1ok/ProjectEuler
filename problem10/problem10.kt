//https://projecteuler.net/problem=10

fun main() {
    val startms = System.currentTimeMillis()
    val start = System.nanoTime()
    val result = problem()
    val time = System.nanoTime()-start
    println("result: $result \ntime: $time nano second")
    println("${System.currentTimeMillis()-startms} ms")
}

fun problem(): Long {
    var listPrime = mutableListOf<Long>(2, 3)
    var check: Long = 5
    while (check < 2000000) {
        var isPrime = true
        for (i in listPrime) {
            if (i*i > check) break
            if (check % i == 0.toLong()) {
                isPrime = false
                break
            }
        }
        if (isPrime) {
            listPrime.add(check)
        }
        check += 2
    }
    var sum: Long = 0
    for (i in listPrime) {
        sum += i
    }
    return sum
}