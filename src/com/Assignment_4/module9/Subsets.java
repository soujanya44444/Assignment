package com.Assignment_4.module9;

// 6. LeetCode 78 – Subsets
import java.util.*;

public class Subsets {

    static List<List<Integer>> result = new ArrayList<>();

    public static void backtrack(int[] nums, List<Integer> temp, int start) {

        result.add(new ArrayList<>(temp));

        for (int i = start; i < nums.length; i++) {

            temp.add(nums[i]);

            backtrack(nums, temp, i + 1);

            temp.remove(temp.size() - 1);
        }
    }

    public static void main(String[] args) {

        int[] nums = {1,2,3};

        backtrack(nums, new ArrayList<>(), 0);

        System.out.println(result);
    }
}