package Easy_21_Merge_Two_Sorted_Lists.Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        ListNode input1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode input2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        System.out.println(mergeTwoLists(input1, input2));
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode output;
        List<Integer> nums = new ArrayList<>();

        ListNode atual = list1;
        while (atual.next != null) {
            nums.add(atual.val);
            atual = atual.next;
        }
        nums.add(atual.val);
        atual = list2;
        while (atual.next != null) {
            nums.add(atual.val);
            atual = atual.next;
        }
        nums.add(atual.val);

        Collections.sort(nums);

        int contador = 0;
        atual = new ListNode();
        atual.next = new ListNode();
        output = atual;

        while (contador < nums.size()) {
            atual.val = nums.get(contador);
            atual = atual.next;
            atual.next = new ListNode();
            contador++;
        }

        return output;
    }
}
