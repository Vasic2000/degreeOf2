import java.util.*
var degree : Int = 1

fun main() {
        val reader = Scanner(System.`in`)
        println("Input number, I tried to decide is it degree of 2!")
        var x1: Double = reader.nextDouble()

        if(isDevide2(x1))
            println("$x1 it's 2 in $degree'th degree")
        else
            println("$x1 isn't any degree of 2")

}

fun isDevide2(x1 : Double) : Boolean {
    var x2 : Double =  (x1 / 2)
    degree++;
    if (2.toDouble() == x2) {
        return true;
    }
    if(x2 < 2) return false
    return isDevide2(x2)
}