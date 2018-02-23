
var globalvar = 3
fun main(args:Array<String>) {
    //have to redeclare variable twice
    if(2 == 2) {
        var x = 3
    }
    else {
        var x = 3
    }
    while(true) {
        var counter: Int = 0
        while (counter < 5) {
            println(counter)
            counter++
        }
        return
    }
    //unresolved variable
    //counter = 3
}