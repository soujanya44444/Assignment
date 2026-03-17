package com.Assignment_4.module9;

// 9. LeetCode 51 – N Queens
import java.util.*;

public class NQueens {

    static List<List<String>> result = new ArrayList<>();

    public static void main(String[] args) {

        int n = 4;

        char[][] board = new char[n][n];

        for (char[] row : board)
            Arrays.fill(row,'.');

        solve(board,0);

        System.out.println(result);
    }

    static void solve(char[][] board,int row){

        if(row==board.length){

            List<String> list=new ArrayList<>();

            for(char[] r:board)
                list.add(new String(r));

            result.add(list);

            return;
        }

        for(int col=0;col<board.length;col++){

            if(valid(board,row,col)){

                board[row][col]='Q';

                solve(board,row+1);

                board[row][col]='.';
            }
        }
    }

    static boolean valid(char[][] board,int r,int c){

        for(int i=0;i<r;i++)
            if(board[i][c]=='Q') return false;

        return true;
    }
}