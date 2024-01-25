package Easy_1929_Concatenation_of_Array.java;

import java.lang.reflect.Array;

public class Solution {
    public static void main(String[] args) {
        int[] input = { 1, 2, 1 };
        System.out.println(getConcatenation(input));
        for (int i : getConcatenation(input)) {
            System.out.println(i);
        }
    }

    public static int[] getConcatenation(int[] nums) {
        int[] out = new int[nums.length + nums.length];
        for (int i = 0; i < nums.length; i++) {
            out[i] = nums [i];
        }
        for (int i = 0; i < nums.length; i++) {
            out[i + nums.length] = nums [i];
        }

        return out;
    }
}
