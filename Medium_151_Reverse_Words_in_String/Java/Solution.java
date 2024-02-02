package Medium_151_Reverse_Words_in_String.Java;

public class Solution {

    public static void main(String[] args) {
        String input = "a good   example";
        System.out.println(reverseWords(input));
    }

    public static String reverseWords(String s) {

        StringBuilder output = new StringBuilder();
        StringBuilder builder = new StringBuilder();

        for (int i = s.length() - 1; i >= 0 ; i--) {
            if (s.charAt(i) != ' ') {
                builder.append(s.charAt(i));
            }else if(builder.length() > 0){
                output.append(builder.reverse()).append(" ");
                builder.setLength(0);
            }
        }

        output.append(builder.reverse());

        return output.toString();
    }
}