class Solution {
    public ListNode reverseList(ListNode head) { 
        ArrayList<Integer> arrayList = new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            arrayList.add(temp.val);
            temp=temp.next;
        }
        if (arrayList.isEmpty()) return null;
        ListNode listNode = new ListNode();
        ListNode headNode = listNode;
        for(int i=arrayList.size()-1;i>=0;i--){
            listNode.val=arrayList.get(i);
            if (i != 0) {
                listNode.next = new ListNode();
                listNode = listNode.next;
}
        }
        return headNode;
        }
   
    }
