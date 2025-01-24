package com.jawa.algorithms;

import org.junit.jupiter.api.Test;

public class MatrixTest {
    char[][] board = {{'5','3','.','.','7','.','.','.','.'}
            ,{'6','.','.','1','9','5','.','.','.'}
            ,{'.','9','8','.','.','.','.','6','.'}
            ,{'8','.','.','.','6','.','.','.','3'}
            ,{'4','.','.','8','.','3','.','.','1'}
            ,{'7','.','.','.','2','.','.','.','6'}
            ,{'.','6','.','.','.','.','2','8','.'}
            ,{'.','.','.','4','1','9','.','.','5'}
            ,{'.','.','.','.','8','.','.','7','9'}};
    int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

    @Test
    void testIsValidSudoku() {
        long before = System.currentTimeMillis();
        System.out.println(Matrix.isValidSudoku(board));
        long after = System.currentTimeMillis();
        System.out.println(after-before);
    }

    @Test
    void testIsValidSudoku2() {
        long before = System.currentTimeMillis();
        System.out.println(Matrix.isValidSudokuOptimised(board));
        long after = System.currentTimeMillis();
        System.out.println(after-before);
    }

    @Test
    void testSpiral(){
        System.out.println(Matrix.spiralOrder(matrix));
    }
}
