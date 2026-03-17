package com.Assignment_4.module9;

// 7. LeetCode 46 – Permutations
import java.util.*;

public class Permutations {

    static List<List<Integer>> result = new ArrayList<>();

    public static void backtrack(int[] nums, List<Integer> temp) {

        if (temp.size() == nums.length) {

            result.add(new ArrayList<>(temp));

            return;
        }

        for (int num : nums) {

            if (temp.contains(num))
                continue;

            temp.add(num);

            backtrack(nums, temp);

            temp.remove(temp.size() - 1);
        }
    }

    public static void main(String[] args) {

        int[] nums = {1,2,3};

        backtrack(nums, new ArrayList<>());

        System.out.println(result);
    }
}