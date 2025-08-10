package org.example;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    private Scanner scanner = new Scanner(System.in);
    private List<String> students = new ArrayList<>();

    public void mainMenu() {
        System.out.println("Welcome to the student manager!");
        System.out.println("1. Add student");
        System.out.println("2. Remove student");
        System.out.println("3. View all students");
        System.out.println("4. Exit");

        String choice = scanner.nextLine();

        if (choice.equals("1")) {
            addStudent();
        } else if (choice.equals("2")) {
            removeStudent();
        } else if (choice.equals("3")) {
            viewStudents();
        } else if (choice.equals("4")) {
            System.out.println("Goodbye!");
            System.exit(0);
        } else {
            System.out.println("Invalid choice. Please try again.");
        }
    }

    public void addStudent() {
        // Prompt the user to enter a new student name (using scanner and I/O methods learned previously,
        // refer to mainMenu() for an example)
        // Add the student to the list
        System.out.print("What is the student's name? ");
        String name = scanner.nextLine();
        students.add(name);
        mainMenu();
    }

    public void removeStudent() {
        // Prompt the user for a student name
        // Use the contains method to check if the student entered is in the list
        // If so, remove it, if not, print "Student not found."
        System.out.print("What is the name of the student you wish to remove? ");
        String student = scanner.nextLine();
        if (students.contains(student)){
            students.remove(student);
            System.out.println("Successfully removed " + student + " from the list of students.");
        }else {
            System.out.println("Student not found.");
        }
        mainMenu();
    }

    public void viewStudents() {
        // Loop through the list of students and print each one
        // (Use a for-each loop!)
        System.out.println("List of students: ");
        for(String student : students){
            System.out.println(student);
        }
        mainMenu();
    }
}
