package com.jawa.dataStructures.stack;

import java.util.LinkedList;

public class StackProblems {

    public static boolean isValidBrackets(String s) {
        char[] chars = s.toCharArray();
        LinkedList<Character> list = new LinkedList<>();
        char bracket = 'x';
        char expected = 'y';
        for(int i=0; i< chars.length; i++) {
            if(list.size()>0) {
                bracket = list.removeLast();
                switch(bracket) {
                    case '(': expected = ')'; break;
                    case '{' : expected = '}'; break;
                    case '[' : expected = ']'; break;
                    default : expected = 'y';
                }
                if (expected != chars[i]) {
                    list.add(bracket);
                    list.add(chars[i]);
                }
            } else {
                list.add(chars[i]);
            }
        }
        if (list.size()==0) return true;
        return false;
    }
}
