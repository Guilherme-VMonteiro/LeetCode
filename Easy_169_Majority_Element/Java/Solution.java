package Easy_169_Majority_Element.Java;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[] { 2, 2, 1, 1, 1, 2, 2 }));
    }

    public static int majorityElement(int[] nums) {

        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            }
        }
        for (int i : nums) {
            if (map.get(i) > nums.length / 2) {
                return i;
            }
        }

        return 0;
    }
}