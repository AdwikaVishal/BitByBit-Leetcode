class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode current=head;
            while (current != null) {
                arr.add(current.val);
                current = current.next;
            }
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

         for (int i = 0; i < arr.size(); i++) {

            boolean found = false;
            for (int j = 0; j < nums.length; j++) {
                if (arr.get(i) == nums[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                tail.next = new ListNode(arr.get(i));
                tail = tail.next;
            }
        }
        return dummy.next;

    }
}
