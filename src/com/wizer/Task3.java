package com.wizer;

import java.util.Arrays;
public class Task3 {
    public static void main(String[] args) {
        int [] arr = {3,3};
        System.out.println(Arrays.toString(indices(arr,6)));
    }

//    Task 3 : Indeces of Target
    public static int[] indices(int [] nums, int target){
        int [] answer = new int[2];
        for (int a = 0; a < nums.length; a++) {
            for (int b = a + 1; b < nums.length; b++) {
                if (nums[a] + nums[b] == target) {
                    answer[0] = a;
                    answer[1] = b;
                    break;
                }
            }
        }
        return answer;
    }
}
