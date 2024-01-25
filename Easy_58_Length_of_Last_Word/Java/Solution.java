package Java;

public class Solution {

    public static void main(String[] args) {
        String input = "Hello World";
        System.out.println(lengthOfLastWord(input));
    }

    public static int lengthOfLastWord(String s) {

        s = s.trim();
        if (s.isEmpty()) {return 0;}
        int last = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                last++;
            } else {
                break;
            }
        }
        return last;
    }
}