package sortMerge;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        int i = scanner.nextInt();
        Solution solution = new Solution();

    }

    public int sorted(int[] nums1, int m, int[] nums2, int n) {
        boolean isSorted = false;
        int last1 = m - 1;
        int last2 = n - 1;

        int index = nums1.length - 1;

        while (last1 >= 0 && last2 >= 0) {
            int l = nums1[last1];
            int r = nums2[last2];

            if (l < r) {
                last2--;
                return nums1[index--] = r;
            } else {
                last1--;
                return nums1[index--] = l;
            }
        }

        while (last2 >= 0) {
            int r = nums2[last2];

            nums1[index--] = r;
            last2--;
        }
        isSorted = true;
        return last1;
    }
}


