package au.edu.swin.sdmd.l02_kotlin

fun main() {
    // using for loop, but checking every value -- this is the AI-generated answer
    for (i in 1..100) {
        if (i % 7 == 0) {
            println(i)
        }
    }

    // skipping every 7; don't start at 0
    for (i in 7..100 step 7) {
        println(i)
    }

    // while loop
    var n = 1
    while (n <= 100) {
        if (n % 7 == 0) {
            println(n)
        }
        n = n + 1
    }

    // very functional approach, filter list then print
    (1..100).filter { it % 7 == 0}.map {println(it)}


}