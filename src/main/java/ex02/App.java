package ex02;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Savannah Osburn
 */

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        // Input
        String myString = myApp.readString();

        // Calculations
        int myStringLength = myApp.numChars(myString);

        // Output
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
