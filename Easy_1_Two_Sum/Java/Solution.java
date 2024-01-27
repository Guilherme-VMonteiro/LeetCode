package Easy_1_Two_Sum.Java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {

        // VALORES TESTES
        int[] numeros = { 3, 3 };
        int alvo = 6;

        // VALORES PARA TESTES DE TEMPO
        Long startTime;
        Long endTime;

        // MINHA IMPLEMENTACAO
        startTime = System.nanoTime();
        String resultado = Arrays.toString(twoSum(numeros, alvo));
        endTime = System.nanoTime();
        System.out.println("TEMPO:" + (endTime - startTime) / 1_000_000.0 + " resultado:" + resultado);

        // COM HASHTABLE
        startTime = System.nanoTime();
        resultado = Arrays.toString(twoSumHashTable(numeros, alvo));
        endTime = System.nanoTime();
        System.out.println("TEMPO:" + (endTime - startTime) / 1_000_000.0 + " resultado:" + resultado);

    }

    // MINHA IMPLEMENTACAO
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && j != i) {
                    return new int[] { i, j };
                }
            }
        }
        return null;
    }

    public static int[] twoSumHashTable(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numToIndex.containsKey(target - nums[i])) {
                return new int[] { numToIndex.get(target - nums[i]), i };
            }
            numToIndex.put(nums[i], i);
        }
        return new int[] {};
    }
}
