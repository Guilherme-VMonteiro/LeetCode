package Easy_13_Roman_to_Integer.Java;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        // String i = "III";
        // String i = "LVIII";
        String i = "MCMXCIV";
        System.out.println(romanToInt(i));
    }

    public static int romanToInt(String in) {
        Map<Character, Integer> s = new HashMap<Character, Integer>() {
            {
                put('I', 1);
                put('V', 5);
                put('X', 10);
                put('L', 50);
                put('C', 100);
                put('D', 500);
                put('M', 1000);
            }
        };
        int sum = 0;

        for (int j = 0; j < in.length(); j++) {
            if (j + 1 < in.length() && s.get(in.charAt(j)) < s.get(in.charAt(j + 1))) {
                sum -= s.get(in.charAt(j));
            } else {
                sum += s.get(in.charAt(j));
            }
        }
        return sum;
    }
}
