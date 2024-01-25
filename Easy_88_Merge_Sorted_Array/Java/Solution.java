package Easy_88_Merge_Sorted_Array.Java;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        merge(new int[] { 1, 2, 3, 0, 0, 0 }, 3, new int[] { 2, 5, 6 }, 3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0, j = m; i < n; i++) {
            nums1[j] = nums2[i];
            j++;
        }

        Arrays.sort(nums1);
        for (int i : nums1) {
            System.out.println(i);
        }
    }

}
