package com.Assignment_4.module9;

// 8. LeetCode 39 – Combination Sum
import java.util.*;

public class CombinationSum {

    static List<List<Integer>> result = new ArrayList<>();

    public static void backtrack(int[] nums, int target, List<Integer> temp, int start) {

        if (target == 0) {

            result.add(new ArrayList<>(temp));

            return;
        }

        if (target < 0)
            return;

        for (int i = start; i < nums.length; i++) {

            temp.add(nums[i]);

            backtrack(nums, target - nums[i], temp, i);

            temp.remove(temp.size() - 1);
        }
    }

    public static void main(String[] args) {

        int[] nums = {2,3,6,7};

        backtrack(nums, 7, new ArrayList<>(), 0);

        System.out.println(result);
    }
}