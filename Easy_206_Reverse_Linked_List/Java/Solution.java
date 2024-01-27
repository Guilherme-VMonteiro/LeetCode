package Easy_206_Reverse_Linked_List.Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        ListNode input = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));

        System.out.println(reverseList(input).next.next.next.next.val);
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }

        List<Integer> values = new ArrayList<>();

        ListNode atual = head;
        while (atual != null) {
            values.add(atual.val);
            atual = atual.next;
        }

        Collections.reverse(values);
        atual = new ListNode(values.get(0));
        ListNode output = atual;
        for (int i = 1; i < values.size(); i++) {
            atual.next = new ListNode(values.get(i));
            atual = atual.next;
        }

        return output;
    }
}
