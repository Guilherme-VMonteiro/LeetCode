package Easy_2469_Convert_the_Temperature.Java;

public class Solution {
    
    public static void main(String[] args) {
        double[] solution = convertTemperature(36.50);
        for (double d : solution) {
            System.out.println(d);
        }
    }

    public static double[] convertTemperature(double celsius) {
        return new double[]{celsius + 273.15,(celsius * 1.80) + 32.00};
    }
}
