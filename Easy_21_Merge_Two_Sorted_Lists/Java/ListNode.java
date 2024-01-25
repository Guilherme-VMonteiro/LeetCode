package Easy_21_Merge_Two_Sorted_Lists.Java;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public String toString() {
        String output = val + "";
        ListNode atual = this;

        while (atual.next != null) {
            output += "," + atual.next.val;
            atual = atual.next;
        }

        return output;
    }
}
