/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Savannah Osburn
 */

package ex02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void output_string_includes_string_and_stringLength () {
        App myApp = new App();
        String name = "Savannah";

        String expectedOutput = "Savannah has 8 characters.";
        String actualOutput = myApp.generateOutputString(name, name.length());

        assertEquals(expectedOutput, actualOutput);
    }
}