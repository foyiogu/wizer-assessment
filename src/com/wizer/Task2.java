package com.wizer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(rotateArray(arr,2)));
    }

//    Task 2: Rotate an array by a target
    public static int[] rotateArray(int [] array, int N){
        for (int i = 0; i < N; i++) {
            int a;
            int indexValue = array[array.length -1];
            for (a = array.length-1; a>0; a--){
                array[a] = array[a-1];
            }
            array[0] = indexValue;
        }

        return array;
    }
}
