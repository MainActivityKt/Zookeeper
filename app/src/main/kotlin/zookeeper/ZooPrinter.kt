package zookeeper

import utils.Animals

fun main() {
    val animalsList = arrayOf(Animals.camel, Animals.lion, Animals.deer, Animals.goose, Animals.bat, Animals.rabbit)

    print("Please enter the number of the habitat you would like to view: ")
    var input = readln()

    while (input != "exit") {

        val animal = animalsList[input.toInt()]
        println()
        println("Switching on the camera in the ${animal.name} habitat...")
        println(animal.asciiImage)
        println(animal.message)

        print("Please enter the number of the habitat you would like to view: ")
        input = readln()
    }
    println("See you later!")
}