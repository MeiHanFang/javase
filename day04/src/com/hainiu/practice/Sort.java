package com.hainiu.practice;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};
//        bubbleSort(arr);
//        selectionSort(arr);
        insertSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    //冒泡排序
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    //选择排序
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            //标记要放入的位置
            int mark = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[mark]) {
                    mark = j;
                }
            }
            if (mark != i) {
                int temp = arr[i];
                arr[i] = arr[mark];
                arr[mark] = temp;
            }
        }
    }

    //插入排序
    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }else {
                    break;
                }
            }
        }
    }
}
