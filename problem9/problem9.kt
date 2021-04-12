//https://projecteuler.net/problem=9

import java.util.*
import kotlin.math.max
import kotlin.math.sqrt

fun main() {
    val startms = System.currentTimeMillis()
    val start = System.nanoTime()
    val result = problem()
    val time = System.nanoTime()-start
    println("result: $result \ntime: $time nano second")
    println("${System.currentTimeMillis()-startms} ms")
}

fun problem(): Int {
    for (i in 1..500) {
        for (j in i until 1000 - i) {
            val k = sqrt((i * i + j * j).toDouble())
            if (k == k.toInt().toDouble() && i + j + k.toInt() == 1000) {
                val mul = i * j * k.toInt()
                println("$i $j $k $mul")
                return mul
            }
        }
    }
    return 0
}