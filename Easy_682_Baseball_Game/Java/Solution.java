package Easy_682_Baseball_Game.Java;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        // String[] input = { "5", "2", "C", "D", "+" };
        String[] input = { "4", "D", "D", "C", "D" };
        System.out.println(calPoints(input));
    }

    public static int calPoints(String[] operations) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < operations.length; i++) {
            switch (operations[i]) {
                case "C":
                    list.remove(list.size() - 1);
                    break;
                case "D":
                    list.add(list.get(list.size() - 1) * 2);
                    break;
                case "+":
                    list.add(list.get(list.size() - 1) + list.get(list.size() - 2));
                    break;
                default:
                    list.add(Integer.parseInt(operations[i]));
                    break;
            }
        }
        return list.stream().reduce(0, (x,y) -> x + y);
    }

}
