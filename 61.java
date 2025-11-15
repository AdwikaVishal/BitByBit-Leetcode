class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;
        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        k = k % count; 
        if (k == 0) return head;
        int[] arr = new int[count];
        current = head;
        int i = 0;
        while (current != null) {
            arr[i++] = current.val;
            current = current.next;
        }

        int[] rotated = new int[count];
        for (i = 0; i < count; i++) {
            rotated[(i + k) % count] = arr[i];
        }
        current = head;
        i = 0;
        while (current != null) {
            current.val = rotated[i++];
            current = current.next;
        }

        return head;
    }
}
