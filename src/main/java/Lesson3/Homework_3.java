package Lesson3;

import java.util.Arrays;

public class Homework_3 {
    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        task_5(5,2);
    }

    public static void invertArray() {
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 0) {
                arr1[i] = 1;
            } else {
                arr1[i] = 0;
            }
        }
        System.out.println("Задание-1 " + Arrays.toString(arr1));
    }

    public static void fillArray() {
        int[] arr2 = new int[100];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i + 1;
        }
        System.out.println("Задание-2 " + Arrays.toString(arr2));
    }

    public static void changeArray() {
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] = arr3[i] * 2;
            }
        }
        System.out.println("Задание-3 " + Arrays.toString(arr3));
    }

    public static void fillDiagonal() {
        int n = 5;
        int[][] arr4 = new int[n][n];
        for (int i = 0; i < n; i++) {
            arr4[i][i] = 1;
            arr4[i][n - i - 1] = 1;
            System.out.println(Arrays.toString(arr4[i]));
        }
    }
    public static void task_5(int len, int initialValue){
        int[] arr5 = new int[len];
        for (int i = 0; i < len; i++) {
            arr5[i] = initialValue;
            System.out.print("[" + i + "]" + arr5[i] + " ");
        }
    }
}

