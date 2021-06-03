package ex02;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Savannah Osburn
 */


/*
Create a program that prompts for an input string and displays output that shows the input string and the number of characters the string contains.

Example Output
What is the input string? Homer
Homer has 5 characters.

Constraints
Be sure the output contains the original string.
Use a single output statement to construct the output.
Use a built-in function of the programming language to determine the length of the string.
 */
public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        // Input
        String myString = myApp.readString();

        // Determine string length
        int myStringLength = myApp.numChars(myString);

        String outputString = myApp.generateOutputString(myString, myStringLength);

        myApp.printOutput(outputString);
    }

    public String readString() {
        System.out.print("What is the input string? ");
        return in.nextLine();
    }

    public int numChars(String myString) {
        return myString.length();
    }

    public String generateOutputString(String myString, int stringLength) {
        return String.format("%s has %d characters.", myString, stringLength);
    }

    public void printOutput(String outputString) {
        System.out.println(outputString);
    }
}
