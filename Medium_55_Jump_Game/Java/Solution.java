package Medium_55_Jump_Game.Java;

import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        // int[] input = { 2, 0 }; // true
        // int[] input = { 0 }; // true
        // int[] input = { 2, 3, 1, 1, 4 }; // true
        // int[] input = { 2, 0, 0 }; // true
        // int[] input = { 2, 5, 0, 0 }; // true
        // int[] input = { 1, 1, 1, 0 }; // true
        // int[] input = { 1, 2, 0, 1 }; // true
        // int[] input = { 1, 1, 2, 2, 0, 1, 1 }; // true
        // int[] input = { 3, 0, 8, 2, 0, 0, 1 }; // true
        int[] input = { 3, 2, 1, 0, 4 }; // false
        // int[] input = { 2, 1, 0, 0 }; // false
        System.out.println(canJump(input));
    }

    public static boolean canJump(int[] nums) {
        List<Integer> list = Arrays.stream(nums).boxed().toList();
        int last = 0;
        for (int i = 0; i < nums.length;) {
            if (list.isEmpty() || list.get(i) >= nums.length) {
                return true;
            }else{
                i++;
                last = i--;
                if (list.get(i) == 0 && last > 1) {
                    i = last;
                }
            }

            
        }
        // int jumps = 0;
        // int length = nums.length - 1;
        // for (int i = 0; i < nums.length;) {
        //     jumps = nums[i];

        //     if (jumps >= length) {
        //         return true;
        //     } else if (jumps > 0) {
        //         i += jumps;
        //         length -= jumps;
        //     } else if (jumps == 0 && length != 0) {
        //         return false;
        //     }
        // }



        return false;
    }
}
