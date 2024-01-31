package Easy_242_Valid_Anagram.Java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
        System.out.println(isAnagramFaster(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        Map<Character, Integer> table = new HashMap<>();

        Character c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            table.put(c, table.getOrDefault(c, 0) + 1);
        }

        Character a;
        for (int i = 0; i < t.length(); i++) {
            a = t.charAt(i);
            table.put(a, table.getOrDefault(a, 0) - 1);
        }

        for (int i : table.values()) {
            if (i != 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean isAnagramFaster(String s, String t) {
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }
}