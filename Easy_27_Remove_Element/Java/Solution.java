package Easy_27_Remove_Element.Java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Solution
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(removeElement(new int[] { 3, 2, 2, 3 }, 3));
    }

    public static int removeElement(int[] nums, int val) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                list.add(nums[i]);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }

        return list.size();
    }
}