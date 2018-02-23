
//basic class initialization
//constructor goes in header
class Pokemon(name:String, level:Int) {
    //secondary constructor
    var type:String = ""

    constructor(name:String, level:Int, type:String):this(name,level) {
        this.type = type
    }
    fun cry() {
        println("chu")
    }
}

//In Java, you need to implement a toString(), copy, and equals to method for classes but in
//Kotlin adding the data keyword before class takes care of those implementations behind the scene
data class PokemonData(var name:String, var level:Int) //: abstractPokemon()
 {
    var type:String = ""

    constructor(name:String, level:Int, type:String):this(name,level) {
        this.type = type
    }
    fun cry() {
        println("chu")
    }

//     override fun cry() {
//         println("Chuuu")
//     }

    //overrides toString function in data class
//    override fun toString():String {
//        return "$name is level $level"
//    }
}
open class Parent(age:Int) {
    open var age = age
    open fun showAge() {
        println("Parent is $age")
    }
}

class Child(age:Int): Parent(0) {
    override var age = age
    override fun showAge() {
        println("Child is $age")
    }
    //functions that does not need a class instance
    companion object {

        @JvmStatic
        fun show() {
            println("Hello")
        }
    }
}

abstract class abstractPokemon {
    abstract fun cry()
}

//since kotlin does not support multiple inheritance must use interface
interface A {
    fun show()
}

interface B {
    fun display()
}

class C : A,B {
    override fun show() {
        println("in show")
    }

    override fun display() {
        println("in display")
    }
}

//companion obj



fun main(args:Array<String>) {
    println("Hello World")
    var pikachu = Pokemon("Pikachu", 100)
    var onix = Pokemon("Onix", 30, "Ground")
    pikachu.cry()
    onix.cry()
    var alakazam = PokemonData("Alakazam", 100)
    println(onix)
    println(alakazam)

    var mom = Parent(40)
    var child = Child(3)
    mom.showAge()
    child.showAge()
    Child.show()
}