import java.io.File
import java.nio.file.Files
import java.util.*

class LineCounter {
    private var count:Long = 0
    fun directoy():String {
        println("Enter the absolute path to your src code")
        var dirScanner = Scanner(System.`in`)
        var path = dirScanner.nextLine()
        if(isDirValid(path)) {
            return path
        }
        return ""

    }

    fun isDirValid(input:String):Boolean {
        var dir = File(input)
        return dir.isDirectory
    }

    fun chooseExt():List<String> {
        var listscan = Scanner(System.`in`)
        println("Enter extensions, use space to seperate each one, the . is not needed")
        var userext = listscan.nextLine()
        userext = userext.toLowerCase()
        var extArray = userext.split(" ")
        return extArray
    }

    fun countLines(path:String, validExtensions:List<String>):Long {


        if(path != "") {
            var myFile = File(path)
            println(myFile)
            var fileList = myFile.listFiles()

            for(file in fileList) {
                //  println(file)
                var ext = file.extension.toLowerCase()
                if(!file.isDirectory && (ext in validExtensions)) {
                    //   var tempFile = BufferedReader(FileReader(file))
                    //   while(tempFile.readLine() != null) {
                    count += Files.lines(file.toPath()).count()
                    // println(file.extension)
                    println(file)
                    //  tempFile.close()
                    //     }
                }
                else if(file.isDirectory) {
                    countLines(file.toString(), validExtensions)

                }
            }

        }
        else {
            println("Not a path to an directory")
        }
        return count
    }
}