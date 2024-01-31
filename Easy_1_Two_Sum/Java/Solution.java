package Easy_1_Two_Sum.Java;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        int[] numeros = { 2, 7, 11, 15 };
        int alvo = 9;

        for (int i : twoSum(numeros, alvo)) System.out.print( i + ", ");
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]),i};
            }
            map.put((nums[i] - target) * -1, i);
        }
        return null;
    }

}
