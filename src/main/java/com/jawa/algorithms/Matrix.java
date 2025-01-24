package com.jawa.algorithms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Matrix {

    public static boolean isValidSudoku(char[][] board) {
        List<Character> list = new ArrayList<>();
        for(int j=0;j<9;j++){
            for(int i=0; i<9; i++){
                char value = board[i][j];
                if(value!='.'){
                    if(list.contains(value)) return false;
                    else list.add(value);
                }
            }
            list = new ArrayList<>();
        }
        list = new ArrayList<>();

        for(int i=0;i<9;i++){
            for(int j=0; j<9; j++){
                char value = board[i][j];
                if(value!='.'){
                    if(list.contains(value)) return false;
                    else list.add(value);
                }
            }
            list = new ArrayList<>();
        }
        list = new ArrayList<>();

        for(int k=0; k<3; k++) {
            for(int i=0; i<3;i++){
                for(int j=k*3; j<(k*3)+3; j++){
                    char value = board[i][j];
                    if(value!='.'){
                        if(list.contains(value)) return false;
                        else list.add(value);
                    }
                }
            }
            list =new ArrayList<>();

            for(int i=3; i<6;i++){
                for(int j=k*3; j<(k*3)+3; j++){
                    char value = board[i][j];
                    if(value!='.'){
                        if(list.contains(value)) return false;
                        else list.add(value);
                    }
                }
            }
            list = new ArrayList<>();

            for(int i=6; i<9;i++){
                for(int j=k*3; j<(k*3)+3; j++){
                    char value = board[i][j];
                    if(value!='.'){
                        if(list.contains(value)) return false;
                        else list.add(value);
                    }
                }
            }
            list = new ArrayList<>();
        }
        return true;
    }


    public static boolean isValidSudokuOptimised(char[][] board) {
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (board[r][c] == '.') {
                    continue;
                }

                char value = board[r][c];
                int boxIndex = (r / 3) * 3 + (c / 3);

                if (rows[r].contains(value) || cols[c].contains(value) || boxes[boxIndex].contains(value)) {
                    return false;
                }

                rows[r].add(value);
                cols[c].add(value);
                boxes[boxIndex].add(value);
            }
        }

        return true;
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> traverseList = new LinkedList<>();
        int left=0, right= matrix[0].length-1;
        int top=0, bottom=matrix.length-1;
        while(top<=bottom && left<=right) {
            for (int i = left; i <= right; i++) {
                traverseList.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                traverseList.add(matrix[i][right]);
            }
            right--;
            if (top <=bottom) {
                for (int i = right; i >= left; i--) {
                    traverseList.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right) {
                for (int i = bottom; i >= top; i--) {
                    traverseList.add(matrix[i][left]);
                }
                left++;
            }
        }
        return traverseList;

    }
}
