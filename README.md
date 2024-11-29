# Zookeeper

This project will help the zookeepers check on the animals and
make sure that they're doing well.

It will be able to process commands from the zookeepers and display
the animals in the terminal.

## Stage 1/4: Rush into print

This stage contains a simple program that will print a number of
messages to the output.

[Open stage 1 on Hyperskill](https://hyperskill.org/projects/196/stages/975/implement)

Stage implementation: [SimplePrinter.kt](app/src/main/kotlin/zookeeper/SimplePrinter.kt)

**Example:**
    The output:

    I love animals!
    Let's check on the animals...
    The deer looks fine.
    The bat looks happy.
    The lion looks healthy.

## Stage 2/4: Show me an animal!

One of the most important parts of working with animals is keeping an eye on them. 
We need to see the animals on the screen to know how they are doing, right? 

Now we are ready to print something awesome: an image of an animal!

[Open stage 2 on Hyperskill](https://hyperskill.org/projects/196/stages/976/implement)

Stage implementation: [AnimalPrinter.kt](app/src/main/kotlin/zookeeper/AnimalPrinter.kt)


## Stage 3/4: What's inside?

In this stage the program:

- Ask for the number of the desired habitat.
- Use the input number as an index of your habitats to print its content.
- Prints the habitat and a message to end the program.
- 
The program stores each habitat as an Animal data type. Check [utils](app/src/main/kotlin/utils)

[Open stage 2 on Hyperskill](https://hyperskill.org/projects/196/stages/977/implement)

Stage implementation: [AnimalPrinter.kt](app/src/main/kotlin/zookeeper/AnimalPrinter.kt)

**Example**

    Please enter the number of the habitat you would like to view: > 4
    
    Switching on the camera in the bat habitat...
    _________________               _________________
    ~-.              \  |\___/|  /              .-~
    ~-.           \ / o o \ /           .-~
    >           \\  W  //           <
    /             /~---~\             \
    /_            |       |            _\
    ~-.        |       |        .-~
    ;        \     /        i
    /___      /\   /\      ___\
    ~-. /  \_/  \ .-~
    V         V
    This bat looks like it's doing fine.
    ---
    You've reached the end of the program. To check another habitat, please restart the watcher.

