package com.jawa.algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BackTracking {

    public static List<String> letterCombinations(String digits) {
    String[] phone_map = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    List<String> output = new ArrayList<>();
    backtrack("", digits, phone_map, output);
    return output;
    }

    private static void backtrack(String combination, String next_digit, String[] phone_map, List<String> output) {
        if (next_digit.isEmpty()) {
            output.add(combination);
        }
        else {
            String letters = phone_map[next_digit.charAt(0) - '2'];
            for (char letter: letters.toCharArray()) {
                backtrack(combination+letter, next_digit.substring(1),phone_map,output);
            }
        }
    }
}
