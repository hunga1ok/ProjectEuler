//https://projecteuler.net/problem=3
fun main() {
    val startms = System.currentTimeMillis()
    val start = System.nanoTime()
    val result = problem3()
    val time = System.nanoTime()-start
    println("result: $result \ntime: $time nano second")
    println("${System.currentTimeMillis()-startms} ms")
}

fun problem3(): Int {
    var primes = mutableListOf<Int>(2, 3, 5, 7)
    for (num in 11..10000) {
        var isPrime = true
        for (i in primes) {
            if (i*i > num) break
            if (num % i == 0) {
                isPrime = false
                break
            }
        }
        if (isPrime) primes.add(num)
    }

    var number: Long = 600851475143
    for (factor in primes) {
        if (factor*factor > number) break
        while(number % factor == 0.toLong()) {
            number /= factor
        }
    }
    return number.toInt()
}