class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverse(l1);
        l2 = reverse(l2);
        ListNode ans = new ListNode(-1);
        ListNode pointer = ans;
        ListNode curr1 = l1;
        ListNode curr2 = l2;
        int carry = 0;
        while(curr1 != null || curr2 != null || carry !=0){
            ListNode n = new ListNode();
             int num =  carry + (curr1 != null ? curr1.val : 0) + (curr2 != null ? curr2.val : 0) ;
            if(num>=10){
                num = num -10;
                carry =1;
            }
            else{
                carry = 0;
            }
            n.val = num;
            pointer.next = n;
            pointer = pointer.next;
            if(curr1!=null) curr1 = curr1.next;
            if(curr2!=null) curr2 = curr2.next;
        }
       ans = reverse(ans.next);
        
        return ans;
        
        
    }
    
    public ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev =null;
        ListNode temp;
        while(curr != null){
            temp = curr.next;
            curr.next = prev;
            prev= curr;
            curr = temp;
        }
        return prev;
    }
}