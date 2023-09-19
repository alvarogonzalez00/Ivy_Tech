#Author: Alvaro Gonzalez
#Program: M02 Lab
#Purpose: The program determines if a student's GPA qualifies them for the Dean's List or Honor Roll

print("Student Academic Record \n \n ----------------------- \n \n")

while True:
    student_last = input ("Enter student's last name: ")
    if student_last == "ZZZ":
        print("Program Exiting .... Goodbye")
        break
#Check user's input for exit command
    else:

        student_first = input("Enter student's first name: ")
    
        student_gpa = float (input("Enter student's GPA: "))
        if student_gpa >= 3.5:
            print(student_first + " " + student_last + " has made the Dean's List.")
        elif student_gpa >= 3.25:
            print(student_first + " " + student_last + " has made the Honor Roll")
        else:
            print(student_first + " " + student_last + " has not made the Dean's List or Honor Roll")
# Determine which category GPA falls under and print student's name and if they have made Honor or Dean's
