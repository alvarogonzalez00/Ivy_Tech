/*  Author: Alvaro Gonzalez
    SDEV 264
    Professor Hammond
    M02 Assignment 2.9
    Purpose: The purpose of this program is the display the
    understanding of loops by creating a program that uses two loops
 */

fun main() {
    for (x in 1..9)
    //declaring the range for the loop
        println("x = $x")
    //output current index
    println("We have exited the first loop")

    for (x in 1..10) {
        println("x = $x")
        if (x == 5) {
            break
            //exit loop when var x is 5
        }

    }
    println("We have exited the second loop")
    println("The application is complete....")
}