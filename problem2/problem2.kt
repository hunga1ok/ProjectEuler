//https://projecteuler.net/problem=2
fun main() {
    val start = System.nanoTime()
    val result = problem2()
    val time = System.nanoTime()-start
    println("result: $result \ntime: $time nano second")
}

fun problem2(): Int {
    var a = 1
    var b = 2
    var check = true

    var sum = 2
    while ( a <= 4e6.toInt() && b <= 4e6.toInt()) {
        if (check) {
            a = a+b
            if (a%2 == 0) sum += a
        } else {
            b = a+b
            if (b%2 == 0) sum += b
        }
        check = !check
    
    }
    return sum
}



