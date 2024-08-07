package au.edu.swin.sdmd.l02_kotlin

fun main() {
    val score1 = Score("Alice")
    println("${score1.name}: ${score1.grade}")

}
// this is the AI-generated answer -- a data class is more obvious though
class Score(val name: String, var grade: String = "Not Graded") {
}

// as a data class
data class Score1(var name: String, var grade: String = "Fail")


