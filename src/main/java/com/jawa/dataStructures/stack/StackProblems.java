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

    public static String simplifyPath(String path) {
        String[] splits = path.split("/");
        LinkedList<String> res = new LinkedList<>();
        res.push(splits[0]);
        if(res.peek().equals("")) res.removeLast();
        for (int i=1; i<splits.length; i++) {
            if (splits[i].equals("")) continue;
            else if (splits[i].equals("..") && res.size()>0) {
                res.pop();
            }else if (!splits[i].equals("..")) res.push(splits[i]);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("/");
        while(res.size()!=0){
            sb.append(res.removeLast());
            if (res.size()!=0) sb.append("/");
        }
        return sb.toString();
    }
}
