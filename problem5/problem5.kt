//https://projecteuler.net/problem=5
fun main() {
    val startms = System.currentTimeMillis()
    val start = System.nanoTime()
    val result = problem5()
    val time = System.nanoTime()-start
    println("result: $result \ntime: $time nano second")
    println("${System.currentTimeMillis()-startms} ms")
}

fun problem5(): Int {
    var primes = mutableListOf<Int>(2)
    var numberOfPrimes = IntArray(21) {0}
    numberOfPrimes[primes[0]] = 1
    for (num in 3..20) {
        var isPrime = true
        for (i in primes) {
            if (i*i > num) break
            if (num % i == 0) {
                isPrime = false
                var tmp = num
                var count = 0
                while(tmp % i == 0) {
                    tmp /= i
                    count ++
                }
                if (numberOfPrimes[i] < count) numberOfPrimes[i] = count
            }
        }
        if (isPrime) {
            primes.add(num)
            numberOfPrimes[num] = 1
        }
    }

    var result = 1
    for (i in 0..20) {
        repeat(numberOfPrimes[i]) { result *= i} 
    }
    return result
}