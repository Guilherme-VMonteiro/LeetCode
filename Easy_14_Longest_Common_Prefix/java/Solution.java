package Easy_14_Longest_Common_Prefix.java;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        String[] strs = { "flower", "flight" , "flow"};
        // String[] strs = { "" };
        // String[] strs = { "","" };
        System.out.println("Return: " + longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {

        String prefix = "";
        Arrays.sort(strs);
        for (int i = 0; i < Math.min(strs[0].length(), strs[strs.length - 1].length()); i++) {
            if (strs[0].charAt(i) != strs[strs.length - 1].charAt(i)) {
                return prefix;
            }else{
                prefix += strs[0].charAt(i);
            }
        }
        return prefix;
    }
}