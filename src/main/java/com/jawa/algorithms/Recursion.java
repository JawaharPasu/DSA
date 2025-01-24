package com.jawa.algorithms;

public class Recursion {

    public static String reverse(String word) {
        if (word.isEmpty()) return "";
        String rev = word.substring(word.length()-1, word.length());
        return  rev + reverse(word.substring(0, word.length()-1));
    }

    public static boolean palindrome(String word) {
        if (word.length()<=1) return true;
        if (word.charAt(0) != word.charAt(word.length()-1)) return false;
        return palindrome(word.substring(1,word.length()-1));
    }

    public static Integer fibonacci(Integer number) {
        if (number==1 || number==2) return 1;
        return fibonacci(number-1)+fibonacci(number-2);
    }

    public static Integer countCoins(Integer[] coins,Integer n, Integer sum) {
        if (sum==0) return 1;
        if (sum<0) return 0;
        if (n<=0) return 0;
        return countCoins(coins,n,sum-coins[n-1])+countCoins(coins,n-1,sum);
    }
}
