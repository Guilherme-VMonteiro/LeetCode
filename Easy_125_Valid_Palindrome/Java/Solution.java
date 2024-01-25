package Java;

public class Solution {

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^A-Za-z0-9]+", "");
        StringBuilder sb = new StringBuilder(s);

        return s.equals(sb.reverse().toString());@
    }
}