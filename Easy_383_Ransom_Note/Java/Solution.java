package Easy_383_Ransom_Note.Java;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aab";

        System.out.println(canConstruct(ransomNote, magazine));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {

        Map<Character, Integer> map = new HashMap<>();

        Character c;
        for (int i = 0; i < ransomNote.length(); i++) {
            c = ransomNote.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < magazine.length(); i++) {
            if (map.isEmpty()) {
                return map.isEmpty();
            }
            c = magazine.charAt(i);
            if (map.get(c) != null) {
                if (map.get(c) == 1) {
                    map.remove(c);
                }else{
                    map.put(c, map.get(c) - 1);
                }
            }
        }

        return map.isEmpty();
    }
}
