package com.Assignment_4.module11;

// 20. LeetCode 239 – Sliding Window Maximum
import java.util.*;

public class SlidingWindowMaximum {

    public static int[] maxSlidingWindow(int[] nums,int k){

        Deque<Integer> dq=new ArrayDeque<>();

        int[] result=new int[nums.length-k+1];

        for(int i=0;i<nums.length;i++){

            while(!dq.isEmpty() && dq.peek()<i-k+1)
                dq.poll();

            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[i])
                dq.pollLast();

            dq.offer(i);

            if(i>=k-1)
                result[i-k+1]=nums[dq.peek()];
        }

        return result;
    }

    public static void main(String[] args){

        int[] nums={1,3,-1,-3,5,3,6,7};

        int k=3;

        System.out.println(Arrays.toString(maxSlidingWindow(nums,k)));
    }
}