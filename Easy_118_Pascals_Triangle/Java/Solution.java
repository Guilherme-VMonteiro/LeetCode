package Easy_118_Pascals_Triangle.Java;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        List<List<Integer>> resultado = generate(1);
        System.out.println(resultado.toString());
    }

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> output = new ArrayList<>();

        List<Integer> ultimo = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            List<Integer> atual = new ArrayList<>();
            atual.add(1);
            for (int j = 1; j < i; j++) {
                if (i - j == 1) {
                    atual.add(1);
                } else {
                    atual.add(ultimo.get(j - 1) + ultimo.get(j));
                }
            }
            ultimo = atual;
            output.add(atual);
        }
        return output;
    }
}
