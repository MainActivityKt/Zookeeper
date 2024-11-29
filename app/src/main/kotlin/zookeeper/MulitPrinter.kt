package zookeeper
import utils.Animals


fun main() {
    val animalsList = arrayOf(Animals.camel, Animals.lion, Animals.deer, Animals.goose, Animals.bat, Animals.rabbit)

    print("Please enter the number of the habitat you would like to view: ")

    val animal = animalsList[readln().toInt()]
    println()
    println("Switching on the camera in the ${animal.name} habitat...")
    println(animal.asciiImage)
    println(animal.message)

    println("---")
    println("You've reached the end of the program. To check another habitat, please restart the watcher.")

}