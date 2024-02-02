package Medium_2_Add_Two_Numbers.Java;

public class Solution {

    public static void main(String[] args) {
        // top
        ListNode tprimeiro = new ListNode(2);
        ListNode tsegundo = new ListNode(4);
        ListNode tterceiro = new ListNode(3);
        tprimeiro.next = tsegundo;
        tsegundo.next = tterceiro;

        // bottom
        ListNode bprimeiro = new ListNode(5);
        ListNode bsegundo = new ListNode(6);
        ListNode bterceiro = new ListNode(4);
        bprimeiro.next = bsegundo;
        bsegundo.next = bterceiro;


        //TESTE 2
        ListNode teste2 = new ListNode(0);

        //TESTE 3
        // TOP
        ListNode tprimeiro3 = new ListNode(9);
        ListNode tsegundo3 = new ListNode(9);
        ListNode tterceiro3 = new ListNode(9); 
        ListNode tquarto3 = new ListNode(9);
        ListNode tquinto3 = new ListNode(9);
        ListNode tsexto3 = new ListNode(9); 
        ListNode tsetimo3 = new ListNode(9);
        tprimeiro3.next = tsegundo3;
        tsegundo3.next = tterceiro3;
        tterceiro3.next = tquarto3;
        tquarto3.next = tquinto3;
        tquinto3.next = tsexto3;
        tsexto3.next = tsetimo3;

        ListNode bprimeiro3 = new ListNode(0);
        ListNode bsegundo3 = new ListNode(0);
        ListNode bterceiro3 = new ListNode(0); 
        ListNode bquarto3 = new ListNode(0);

        bprimeiro3.next = bsegundo3;
        bsegundo3.next = bterceiro3;
        bterceiro3.next = bquarto3;

        ListNode resposta = addTwoNumbers(tprimeiro3, bprimeiro3);
        System.out.println(resposta.val);
        System.out.println(resposta.next.val);
        System.out.println(resposta.next.next.val);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        if (l1.next == null) {
            
        }

        ListNode result = new ListNode();

        

        return result;
    }
}
