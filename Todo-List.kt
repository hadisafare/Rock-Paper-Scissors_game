package com.example.consoling

fun main() {

    var computerbord = 0
    var userbord = 0

    while (true) {

        println("choose your choice: ")
        println(" Rock")
        println(" Paper")
        println(" Scissors")
        println("Exit.")

        var choice = readln()
          choice = choice.lowercase()
            choice = choice.replaceFirstChar{ it.uppercase() }

          if (choice == "Exit") 
        {
            break
        }

        var computer = listOf("Rock", "Paper", "Scissors").random()

        if (choice == "Rock" && computer == "Scissors") {
            println("you win!")
            userbord++
        }

        if (choice == "Paper" && computer == "Rock") {
            println("you win!")
            userbord++
        }

        if (choice == "Scissors" && computer == "Paper") {
            println("you win!")
            userbord++
        }

        if (choice == "Rock" && computer == "Paper") {
            println("computer win!")
            computerbord++
        }

        if (choice == "Paper" && computer == "Scissors") {
            println("computer win!")
            computerbord++
        }

        if (choice == "Scissors" && computer == "Rock") {
            println("computer win!")
            computerbord++
        }

        if (choice == "Rock" && computer == "Rock") {
            println("draw!")
        }

        if (choice == "Paper" && computer == "Paper") {
            println("draw!")
        }

        if (choice == "Scissors" && computer == "Scissors") {
            println("draw!")
        }

        println("Your score: $userbord")
        println("Computer score: $computerbord")

        if (computerbord == 3) {
            println("Computer wins the game!")
            break
        }

        if (userbord == 3) {
            println("You win the game!")
            break
        }
    }
}
