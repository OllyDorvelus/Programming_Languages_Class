import com.sun.org.apache.xpath.internal.operations.Bool
import java.util.Scanner
import java.io.File
import java.io.BufferedReader
import java.io.FileReader
import java.nio.file.Files

fun main(args:Array<String>) {
    var linecounter = LineCounter()
    var myDir = linecounter.directoy()
    var validExtensions = linecounter.chooseExt()
    println(linecounter.countLines(myDir, validExtensions))
}


