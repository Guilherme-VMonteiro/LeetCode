package Medium_274_HIndex.Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        List<int[]> inputs = new ArrayList<>();
        inputs.add(new int[] { 3, 0, 6, 1, 5 });
        inputs.add(new int[] { 1, 3, 1 });
        inputs.add(new int[] { 13, 15 });
        inputs.add(new int[] { 0 });

        int[] output = { 3, 1, 2, 0 };

        int res = 0;
        for (int i = 0; i < inputs.size(); i++) {
            res = hIndex(inputs.get(i));
            if (output[i] == res) {
                System.out.println("OK");
            }else{
                System.out.println("ERROR, INPUT: " + inputs.get(i) + " RESPONSE: " + res + " ESPECTED: " + output[i]);
                break;
            }
        }
    }

    public static int hIndex(int[] citations) {
        List<Integer> list = new ArrayList<>();

        for (int i : citations) {
            list.add(i);
        }

        Collections.sort(list);
        Collections.reverse(list);
        list = list.stream().filter(j -> j > 0).collect(Collectors.toList());

        int soma = list.stream().mapToInt(Integer::intValue).sum();

        if (list.isEmpty() || soma / list.size() > list.size() ) {
            return list.size();
        }

        return soma / list.size();
    }
}
