//https://projecteuler.net/problem=4
fun main() {
    val startms = System.currentTimeMillis()
    val start = System.nanoTime()
    val result = problem4()
    val time = System.nanoTime()-start
    println("result: $result \ntime: $time nano second")
    println("${System.currentTimeMillis()-startms} ms")
}

fun problem4(): Int {
    var max = 0
    for (i in 900..999) {
        for (j in i..999) {
            var num = i * j;
            if (num == num.toString().reversed().toInt()) {
                if (max < num) max = num
            }
        }
    }
    return max

}