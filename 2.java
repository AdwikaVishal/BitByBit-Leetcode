import java.math.BigInteger;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder s1Builder = new StringBuilder();
        StringBuilder s2Builder = new StringBuilder();
        ListNode result = new ListNode(0); 
        ListNode temp1 = l1;
        ListNode temp2 = l2;

        while (temp1 != null) {
            s1Builder.append(temp1.val);
            temp1 = temp1.next;
        }
        while (temp2 != null) {
            s2Builder.append(temp2.val);
            temp2 = temp2.next;
        }
        String s1 = s1Builder.reverse().toString();
        String s2 = s2Builder.reverse().toString();

        BigInteger number1 = new BigInteger(s1);
        BigInteger number2 = new BigInteger(s2);
        BigInteger ans = number1.add(number2);

        s1 = new StringBuilder(ans.toString()).reverse().toString();

        ListNode curr = result;

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            int n = ch - '0'; 
            curr.next = new ListNode(n);
            curr = curr.next;
        }

        return result.next; 
    }
}
