package Easy_119_Pascals_Triangle_II.Java;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        List<Integer> resultado = getRow(3);
        System.out.println(resultado.toString());
    }

    public static List<Integer> getRow(int rowIndex) {
        Integer[] output = new Integer[rowIndex + 1];

        for (int i = 0; i <= rowIndex; i++) {
            output[i] = ((fat(rowIndex).divide((fat(i).multiply(fat(rowIndex - i)))).intValue()));
        }
        return Arrays.asList(output);
    }

    public static BigInteger fat(int num){
        if (num == 0) {
            return BigInteger.ONE;
        }else{
            return fatorial(num);
        }
    }

    public static BigInteger fatorial(int num){
        if (num == 1) {
            return BigInteger.ONE;
        }else{
            return BigInteger.valueOf(num).multiply(fatorial(num - 1));
        }
    }
}
