//importing java class, 100% interpoable with Java
import java.util.Scanner

fun main(args:Array<String>) {
var num1 = 100
var num2 = 1000
var result:Int
    //can assign var to result of if else statement/switch case statement
    result = if(num1 > num2) {
        num1
    }
    else {
        num2
    }
guess()
//forLoops()
}

fun guess() {
    var num = 3
    //val indicates a variable that cant be changed

    val input = Scanner(System.`in`)
    //basic while and if else statements
    //while statement
    while(true) {
        print("Guess a Number: ")
        //try catch statement if user inputs something dumb
        try {
            var guessnum = input.nextInt()

            //if statement
            if(num == guessnum) {
                println("Your guess is right $num = $guessnum")
                return
            } else if (guessnum > num) {
                println("Your guess $guessnum is high")
            } else {
                println("Your guess $guessnum is low")
            }
        }
        catch(e: Exception) {
            println("Next time enter a number")
            return
        }
    }


}

fun switchCase() {
    //switch statement
    val num: Int = 2
    when(num) {
        1 -> println("One")
        2 -> println("Two")
        3 -> println("Three")
        else -> println("Give a  proper input")
    }

}

fun forLoops() {
    //kotlin takes more of the python route of doing for loops (range)
    for(i in 1..10) {
        println(i)
    }
    println()
    var nums = 1..16
    var nums2 = 1 until 16
    var nums3 = 16 downTo 1
    for(a in nums step 2) {
        println(a)
    }
    println()
    for(a in nums2) {
        println(a)
    }
    println()
    for(a in nums3) {
        println(a)
    }

}