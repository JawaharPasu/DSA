package com.jawa.algorithms;

public class DynamicMemoization {

    public static Integer fibonacci(Integer number, Integer[] memory) {
        if (memory[number-1] != null) return memory[number-1];
        if (number==1 || number==2) return 1;
        Integer var = fibonacci(number-1, memory)+fibonacci(number-2, memory);
        memory[number-1] = var;
        return var;
    }

    public static Integer countCoins(Integer[] coins,Integer n, Integer sum, Integer[][] memory) {
        if (sum==0) return memory[n][sum] = 1;
        if (sum<0 || n==0) return 0;
        if (memory[n][sum] != -1) return memory[n][sum];
        return countCoins(coins,n,sum-coins[n-1], memory)+countCoins(coins,n-1,sum, memory);
    }
}
