class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int len = 0;
        ListNode t = head;
        while (t != null) {
            len++;
            t = t.next;
        }

        int[] arr = new int[len];
        int i = 0;
        ListNode temp = head;
        while (temp != null) {
            arr[i] = temp.val;
            i++;
            temp = temp.next;
        }

        if (left != right) {
            int l = left - 1;
            int r = right - 1;
            while (l < r) {
                int x = arr[l];
                arr[l] = arr[r];
                arr[r] = x;
                l++;
                r--;
            }
        }

        ListNode list = new ListNode(0);
        ListNode tem = list;
        for (int x : arr) {
            tem.next = new ListNode(x);
            tem = tem.next;
        }

        return list.next;
    }
}
