package com.jawa.algorithms;

import java.util.Arrays;

public class DynamicTabulated {

    public static void fibonacci(Integer number) {
        Integer sum = 0;
        Integer[] arr = new Integer[number];
        arr[0] = 1;
        for (int i = 1; i<number; i++) {
            if (i==1) arr[1] = 1;
            else arr[i] = arr[i-1]+arr[i-2];
        }
        System.out.println(arr[number-1]);
    }

    public static int countCoins(Integer[] coins, int n, int sum) {
        // 2D dp array where n is the number of coin
        // denominations and sum is the target sum
        int[][] dp = new int[n + 1][sum + 1];

        // Represents the base case where the target sum is 0,
        // and there is only one way to make change: by not
        // selecting any coin
        dp[0][0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                // Add the number of ways to make change without
                // using the current coin
                dp[i][j] += dp[i - 1][j];

                if ((j - coins[i-1]) >= 0) {
                    // Add the number of ways to make change
                    // using the current coin
                    dp[i][j] += dp[i][j - coins[i-1]];
                }
            }
        }
        return dp[n][sum];
    }

    public static long countCoinsOptimised(Integer coins[], int n, int sum)
    {
        // dp[i] will be storing the number of solutions for
        // value i. We need sum+1 rows as the dp is
        // constructed in bottom up manner using the base case
        // (sum = 0)
        int dp[] = new int[sum + 1];

        // Base case (If given value is 0)
        dp[0] = 1;

        // Pick all coins one by one and update the dp[]
        // values after the index greater than or equal to the
        // value of the picked coin
        for (int i = 0; i < n; i++)
            for (int j = coins[i]; j <= sum; j++)
                dp[j] += dp[j - coins[i]];

        return dp[sum];
    }

    public static Integer[] primeNumbers(Integer number) {
        Integer[] primes = new Integer[number+1];
        Arrays.fill(primes, -1);
        primes[0] = 0;
        primes[1] = 1;
        for (int i=2; i<number; i++) {
            for (int j=i-1; j>1;j--) {
                if (i%j==0) {
                    primes[i] = 0;
                    break;
                }
            }
            if (primes[i] != 0) primes[i] = i;
        }

        return Arrays.stream(primes).filter(n -> (n!=0 && n!=-1)).toArray(Integer[]::new);
    }
}
