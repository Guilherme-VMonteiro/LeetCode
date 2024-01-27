package Easy_20_Valid_Parentheses.Java;

import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
        // String input = "()"; // true
        // String input = "()[]{}"; // true
        // String input = "(]"; // false
        String input = "]"; // false
        // String input = "(])"; // false
        System.out.println(isValid(input));
    }

    public static boolean isValid(String s) {

        Stack<Character> p = new Stack<>();
        String c = "([{";

        for (int i = 0; i < s.length(); i++) {
            if (c.contains(String.valueOf(s.charAt(i)))) {
                p.push(s.charAt(i));
            } else if(!p.isEmpty()){
                if (s.charAt(i) == ')' && p.peek() == '(') {
                    p.pop();
                } else if (s.charAt(i) == ']' && p.peek() == '[') {
                    p.pop();
                } else if (s.charAt(i) == '}' && p.peek() == '{') {
                    p.pop();
                } else {
                    return false;
                }
            }else{
                return false;
            }
        }
        return p.isEmpty();
    }
}