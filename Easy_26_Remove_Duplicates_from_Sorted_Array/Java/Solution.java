package Easy_26_Remove_Duplicates_from_Sorted_Array.Java;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[] { 1, 1, 2 }));
    }

    public static int removeDuplicates(int[] nums) {

        /*
         * SO E VIAVEL SE OS NUMEROS INSERIDOS ESTIVEREM FORA DE ORDEM! 
         *  
         * List<Integer> list = new ArrayList<>();
         * 
         * int counter = 0;
         * for (int i : nums) {
         * if(!list.contains(i)){
         * list.add(i);
         * nums[counter] = i;
         * counter++;
         * }
         * }
         * 
         * return counter;
         * 
         * COMO NO PROBLEMA OS NUMEROS VEM EM ORDEM, BASTA USAR 2 PONTEIROS E \
         * COMPARAR O ATUAL COM O ANTERIOR :D
         */
        
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        
        return j;
    }
}
