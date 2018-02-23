

fun main(args:Array<String>) {
    println("Hello World")
    var num = addNumbers(3, 8)
    var num2 = addNumbers(b=3,a=1)
    var num3 = subtract(300, 100)
    var num4 = multiply(10)
    println(num)
    println(num2)
    println(num3)
    println(num4)
}

//fun addNumbers(a:Int, b:Int) {
//    a + b
//}

fun addNumbers(a:Int, b:Int): Int {
    return a + b
}

//inline function
//explicit
fun subtract(a : Int, b : Int):Int = a-b

//implicit and default parameter value
fun multiply(a : Int, b : Int = 5) = a*b
//setting function return value equal to an if else statement
fun max(a : Int, b : Int): Int = if(a>b) a else b