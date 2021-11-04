package com.wizer;

public class Task1 {

    public static void main(String[] args) {
//        Task 1
	rightAlignedtriangle(5);

    }
//    Task 1 : Right Aligned Triangle
    public static void rightAlignedtriangle(int height){
        for (int i = 0; i <= height; i++) {
            String ans = String.valueOf(i);
            System.out.println(ans.repeat(i).replaceAll(ans,"*"));
        }
    }
}
