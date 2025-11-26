class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<lists.length;i++){
            ListNode current = lists[i];
            while (current != null) {
                arr.add(current.val);
                current = current.next; }
        }
        Collections.sort(arr);
        ListNode head = null;
        ListNode tail = null;

        for (int i = 0; i < arr.size(); i++) {       
            ListNode newNode = new ListNode(arr.get(i)); 

            if (head == null) { 
                head = newNode;
                tail = newNode;
            } else {             
                tail.next = newNode;
                tail = tail.next;
            }
        }

        return head;
    }
}
