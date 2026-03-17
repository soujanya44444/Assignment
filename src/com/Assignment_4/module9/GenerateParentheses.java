package com.Assignment_4.module9;

// 10. LeetCode 22 – Generate Parentheses
import java.util.*;

public class GenerateParentheses {

    static List<String> result = new ArrayList<>();

    static void backtrack(String s,int open,int close,int n){

        if(s.length()==2*n){

            result.add(s);

            return;
        }

        if(open<n)
            backtrack(s+"(",open+1,close,n);

        if(close<open)
            backtrack(s+")",open,close+1,n);
    }

    public static void main(String[] args){

        int n=3;

        backtrack("",0,0,n);

        System.out.println(result);
    }
}