package sortMerge;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int arr1[] = {9,8,10};

        int arr2[] = {6,8,7};

        int mas1 = arr1.length;
        int mas2 = arr2.length;
        int arr3[] = new int[mas1 + mas2];
        mergeArrays(arr1, arr2, mas1, mas2, arr3);
        System.out.println("result: ");
        for (int i = 0; i < mas1 + mas2; i++){
            System.out.println(arr3[i] + " ");
        }
    }

    public static void mergeArrays(int[] arr1, int[] arr2, int n1, int n2, int[] arr3) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < n1) {
            arr3[k++] = arr1[i++];
        }
        while (j < n2) {
            arr3[k++] = arr2[j++];
        }

        Arrays.sort(arr3);
    }
}



