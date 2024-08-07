package au.edu.swin.sdmd.l02_kotlin

fun main() {
    print(passFail3(49))
}

// old school if-statement -- IDE will suggest to lift return out
fun passFail(x: Int): String {
    if(x>=50) {
        return "Pass"
    } else {
        return "Fail"
    }
}

// compact function -- most Kotlin-y answer
fun passFail1(num: Int): String = if (num >= 50) "pass" else "fail"

// traditional function, but using return if statement -- this is the AI-generated answer
fun passFail2(score: Int): String {
    return if (score >= 50) "pass" else "fail"
}

// with error checking
fun passFail3(score: Int): String {
    return if (score in 0..100) {
        if (score >= 50) "pass" else "fail"
    } else {
        "Invalid score"
    }
}

