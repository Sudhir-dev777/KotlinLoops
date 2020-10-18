/**
 * Created by jyotirani on 18/09/17.
 */

// Write a program to display the first ten natural numbers.

fun main(args: Array<String>) {

    var language = arrayOf("Kotlin", "Java", "Python", "C++")

    for (item in language.indices) {

        
        if (item%2 == 0)
            println(language[item])
    }
}

  
  
