/*
Author: Alvaro Gonzalez
SDEV 264
M02 Assignment 3.6
Professor Hammond
Purpose: The purpose of this program is to receive user input for a Student and a Teacher and then
display that information
 */
import java.util.Scanner //import Scanner
open class Person (var fName: String, var lName: String, var address: String, var city: String,
                   var state: String, var zip: Int )
//Declare Person superclass

class Student(fName: String, lName: String, address: String, city: String, state: String,
   zip: Int, var gpa: Double, var major: String) : Person(fName,lName,address,city,state,zip) {
       //declare properties of Student class that inherits from Person class
    fun displayInfo() {
        println("Student Information: ")
        println("====================")
        println("Name: $fName $lName")
        println("Address: $address, $city, $state, $zip")
        println("GPA: $gpa")
        println("Major: $major")
        println("======================")
    }
    //function that prints student information
}

class Teacher(fName: String, lName: String, address: String, city: String, state: String,
              zip: Int) : Person(fName,lName,address,city,state,zip){
                  //declare Teacher properties that it inherits from Person
    fun displayInfo() {
        println("Teacher Information: ")
        println("====================")
        println("Name: $fName $lName")
        println("Address: $address, $city, $state, $zip")
    }
    //function that prints teacher information
}


fun main() {
    val scanner = Scanner(System.`in`)
//scanner verifies that the user input matches the required data type
    println("Enter Student First Name: ")
    val studentFName = scanner.nextLine()
    println("Enter Student Last Name: ")
    val studentLName = scanner.nextLine()
    println("Enter Student's Street Address: ")
    val studentAddress = scanner.nextLine()
    println("Enter Student's City: ")
    val studentCity = scanner.nextLine()
    println("Enter Student's State: ")
    val studentState = scanner.nextLine()
    println("Enter Student's Zip Code: ")
    val studentZip = scanner.nextInt()
    println("Enter Student's GPA: ")
    val studentGpa = scanner.nextDouble()
    scanner.nextLine()
    //ensure buffer is empty before receiving next line of user input
    println("Enter Student's Major: ")
    val studentMajor = scanner.nextLine()
    //prompt user to input Student information and verify it matches data type requirement

    val  student = Student(studentFName, studentLName, studentAddress, studentCity, studentState, studentZip,
        studentGpa, studentMajor)
//create an instance of Student()
    student.displayInfo()
//call on display function
    println("Enter Teacher's First Name: ")
    val teacherFName = scanner.nextLine()
    println("Enter Teacher's Last Name: ")
    val teacherLName = scanner.nextLine()
    println("Enter Teacher's Street Address: ")
    val teacherAddress = scanner.nextLine()
    println("Enter Teacher's City: ")
    val teacherCity = scanner.nextLine()
    println("Enter Teacher's State: ")
    val teacherState = scanner.nextLine()
    println("Enter Teacher's Zip Code: ")
    val teacherZip = scanner.nextInt()
//prompt user to input Teacher information

    val  teacher = Teacher(teacherFName, teacherLName, teacherAddress, teacherCity, teacherState, teacherZip)
//create an instance of Teacher class
    teacher.displayInfo()
    //call on displayInfo function and print teacher information
    scanner.close()

}
