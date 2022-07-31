class Solution {
    public void reorderList(ListNode head) {
        if(head.next==null || head.next.next==null) return;
        ListNode mid=getMid(head);
        ListNode reverseHead=reverseList(null,mid.next,mid.next.next);
         mid.next=reverseHead;
        ListNode sl=head;
        ListNode sr=reverseHead;
           while(sr!=null){
                ListNode temp=sl.next;
          ListNode Temp=sr.next;
            sl.next=sr;
            sr.next=temp;
            sr=Temp;
            sl=temp;
           }
        mid.next=null;
    }
    public ListNode getMid(ListNode head){
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode reverseList(ListNode prev,ListNode present,ListNode Next){
       while(present!=null){
            present.next=prev;
            prev=present;
            present=Next;
           if(Next!=null)  Next=Next.next;
        }
        return prev;   
    }
}