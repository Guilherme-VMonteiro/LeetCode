
public class Solution {

    public static void main(String[] args) {
        // int[] input = { 1, 2, 3 };
        // int[] input = {9,8,7,6,5,4,3,2,1,0}; // [9,8,7,6,5,4,3,2,1,1]
        int[] input = {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6}; 
        int[] out = plusOne(input);
        for (int i = 0; i < out.length; i++) {
            System.out.println(out[i]);
        }
    }

    public static int[] plusOne(int[] digits) {

        // COMO PODEMOS LIDAR COM ARRAYS DE NUMEROS MUITO GRANDES, EM QUE A SOMA DE SEUS NUMEROS SAO MAIORES QUE 2.147.483.647  
        // NAO CONSEGUIMOS USAR UMA VARIAVEL E IR SOMANDO OS VALORES, PORQUE EM ALGUM MOMENTO ELA IRA DAR OVERFLOW,
        // POIS O INTEIRO TEM O VALOR MAXIMO DE 2.147.483.647!
        // LOGO, A MELHOR FORMA E QUE EVITA ESTES PROBLEMAS DE OVERFLOW E IR LIDANDO COM O ARRAY EM SI, PELO FATO DE QUE O ARRAY
        // TEM TAMANHO "INFINITO"! 
        for (int i = digits.length - 1 ; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
