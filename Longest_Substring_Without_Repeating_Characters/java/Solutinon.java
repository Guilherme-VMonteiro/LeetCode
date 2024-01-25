package Longest_Substring_Without_Repeating_Characters.java;

import java.util.LinkedHashSet;
import java.util.Set;

public class Solutinon {
    public static void main(String[] args) {
        // String input = "abcabcbb"; // 3
        // String input = "bbbbb"; // 1
        String input = "pwwkew"; // 3
        // String input = "au"; // 2
        // String input = "dvdf"; // 3
        // String input = "anviaj"; // 5
        System.out.println(lengthOfLongestSubstring(input));
    }

    public static int lengthOfLongestSubstring(String s) {

        if (s.length() == 1)
            return 1;
        Set<String> set = new LinkedHashSet<>();
        int maior = 0;
        int contador = 0;
        s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            if (!set.contains(String.valueOf(s.charAt(i)))) {
                set.add(String.valueOf(s.charAt(i)));
                contador += 1;
                if (maior < contador) {
                    maior = contador;
                }
            } else {
                if (maior < contador) {
                    maior = contador;
                }
                set.clear();
                // if (s.charAt(i - 1) != s.charAt(i)) {
                //     contador = 2;
                //     set.add(String.valueOf(s.charAt(i - 1)));
                //     set.add(String.valueOf(s.charAt(i)));
                // } else {
                //     contador = 1;
                //     set.add(String.valueOf(s.charAt(i)));
                // }
                contador = 1;
                i = s.indexOf(s.charAt(i)) + 1;
            }
        }

        return maior;
    }
}
