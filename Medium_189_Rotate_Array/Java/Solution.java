package Medium_189_Rotate_Array.Java;

public class Solution {
    public static void main(String[] args) {
        int[] input = { 1, 2, 3, 4, 5, 6, 7 };
        // {5,6,7,1,2,3,4}
        int steps = 3;
        rotate(input, steps);
    }


    public static void rotate(int[] nums, int k) {
        int[] rotated = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            rotated[(i + k) % rotated.length] = nums[i];
        }
        for (int i = 0; i < rotated.length; i++) {
            nums[i] = rotated[i];
        }
    }
}
