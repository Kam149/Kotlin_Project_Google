package example.myapp

import java.util.*

fun main(args: Array<String>) {
    val min = 0
    val max = 100
    var nbAtmpts = 0
    val random = SplittableRandom()
    val reader = Scanner(System.`in`)
    val goal = random.nextInt(min, max)
    var usGuss: Int

    computerSays("I chose a number between $min and $max")
    
    do {
        nbAtmpts++
        computerSays("What's your guess?")
        usGuss = reader.nextInt()
        when {
    usGuss > goal -> computerSays("less !")
    usGuss < goal -> computerSays("more !")
    usGuss == goal -> computerSays("Congratulation ! You found correct number in $nbAtmpts attempts.")
}while(usGuss != goal)

    computerSays("Congratulation ! You found correct number in $nbAtmpts attempts.")
}

fun String.outputAsComputer() {
    println("Computer : " + this)
}
