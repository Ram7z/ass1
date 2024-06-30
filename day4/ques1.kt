//FUNCTION THAT TAKES TWO INTEGERS N RETURN THE LARGER OF THE TWO//
fun main() {
    val n1 = 9999
    val n2 = 10
    println("the larger return of $n1 and $n2 is ${maxofTwo(n1,n2)}")
}

fun maxofTwo(x:Int,y:Int): Int{
    return if (x>y)x
    else y
}
