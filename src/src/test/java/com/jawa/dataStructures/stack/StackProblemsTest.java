package com.jawa.dataStructures.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StackProblemsTest {

    @Test
    void testIsValidBrackets1() {
        String input = "()";
        boolean actual = StackProblems.isValidBrackets(input);
        assertEquals(true, actual);
    }

    @Test
    void testIsValidBrackets2() {
        String input = "(]";
        boolean actual = StackProblems.isValidBrackets(input);
        assertEquals(false, actual);
    }

    @Test
    void testIsValidBrackets3() {
        String input = "()[]{}";
        boolean actual = StackProblems.isValidBrackets(input);
        assertEquals(true, actual);
    }

    @Test
    void testIsValidBrackets4() {
        String input = "([])";
        boolean actual = StackProblems.isValidBrackets(input);
        assertEquals(true, actual);
    }

}