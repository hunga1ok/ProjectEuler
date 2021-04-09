//https://projecteuler.net/problem=27
fun main() {
    problem27()
}

fun problem27() {
    var primesNumber = mutableListOf(2,3)
    var primesCheck = BooleanArray(1000001)
    primesCheck[2] = true
    primesCheck[3] = true

    for (i in 5..1000000) {
        var isPrime = true
        for (num in primesNumber) {
            if (num*num > i) break
            if (i%num == 0) {
                isPrime = false
                break
            }
        }
        if (isPrime) {
            primesNumber.add(i)
            primesCheck[i] = true
        }
    }
    var max = 0
    var aa = 0
    var bb = 0

    for (a in -1000..1000) {
        for (b in primesNumber) {
            if (b>1000) break
            var counter = 0
            for (i in 0..10000) {
                val tmp = i*i + a*i + b
                if (tmp > 0 && primesCheck[tmp]) {
                    counter ++
                } else {
                    break
                }
            }
            if (counter > max) {
                max = counter
                aa = a
                bb = b
            }
        }
    }
    println("$max $aa $bb \nresult = ${aa*bb}")
}