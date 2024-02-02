package Medium_7_Reverse_Integer.Java;

public class Solution {
    public static void main(String[] args) {
        int i = 1534236469;
        System.out.println(reverse(i));
    }

    private static int reverse(int x) {

        if (x == 0){
            return 0;
        } 

        int sinal = 0;
        if (x > 0) {
            sinal = 1;
        }else{
            sinal = -1;
        }

        if (x == Integer.MIN_VALUE){
            return 0;
        }

        x = Math.abs(x);

        long numeroInvertido = 0;
        while (x > 0) {
            numeroInvertido = numeroInvertido * 10 + x % 10;
            x /= 10;
        }

        if (numeroInvertido > Integer.MAX_VALUE) return 0;

        return (int) (numeroInvertido * sinal);
    }
}
