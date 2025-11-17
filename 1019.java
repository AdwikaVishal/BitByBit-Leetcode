/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
         int len = 0;
        ListNode t = head;
        while (t != null) {
            len++;
            t = t.next;
        }

        int[] arr = new int[len];
        int i=0;
         ListNode temp = head;

        while (temp != null) {

            ListNode temp2 = temp.next;
            int found = 0;  
            while (temp2 != null) {
                if (temp2.val > temp.val) {
                    found = temp2.val;
                    break; 
                }
                temp2 = temp2.next;
            }
            arr[i] = found;   
            i++;             
            temp = temp.next;
        }

        return arr;
    }
}
