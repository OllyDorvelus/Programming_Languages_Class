
fun main(args:Array<String>) {
    println("Hello World")

    //arrays
    // Kotlin has own Arrays class that allows a variable to initlaized to an array with parameters such as size
    // This size is not dynamic
    var numArray = IntArray(4)
    // A more definite way of declaring an array, this is an array of any data type desired
    //note that you can declare initialcapcity, but will resize if more elements are added in
    var stringArray = ArrayList<String>(5)
    //must use add func to add element
    //builds array dynamically
    stringArray.add("Okay")
    println(numArray[2])
    println(stringArray[0])
    //Kotlin can make arrays where the types aren't the same
    var randomArray = arrayOf(3, 2, "String", true)
    println(randomArray[3])
    //by default arrays/list in Kotlin aren't mutable
    //to make mutable
    var list = listOf(3, 4)
    //list[0] = 4 gives error
    var mutableList = arrayOf<Int>(5)
 //   mutableList.add(5)
    mutableList[0] = 3
}

