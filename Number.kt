package example.myapp

import java.util.*

fun main(args: Array<String>) {
    val min = 0
    val max = 100
    var nbAttempts = 0
    val random = SplittableRandom()
    val reader = Scanner(System.`in`)
    val goal = random.nextInt(min, max)
    var userGuess: Int

    computerSays("I chose a number between $min and $max")
    
    do {
        nbAttempts++
        computerSays("What's your guess?")
        userGuess = reader.nextInt()
        when {
    userGuess > goal -> computerSays("less !")
    userGuess < goal -> computerSays("more !")
    userGuess == goal -> computerSays("Congratulation ! You found in $nbAttempts attemps.")
}while(userGuess != goal)

    computerSays("Congratulation ! You found in $nbAttempts attemps.")
}

fun String.outputAsComputer() {
    println("Computer : " + this)
}
