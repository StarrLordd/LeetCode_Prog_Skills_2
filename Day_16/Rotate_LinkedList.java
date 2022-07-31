package LeetCode_Prog_Skills_2.Day_16;

public abstract class Rotate_LinkedList {
    
}
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
    public ListNode rotateRight(ListNode head, int k) {
        if(k==0 || head==null) return head;
        ListNode temp=head;
        int count=1;
        while(temp.next!=null){
            count++;
            temp=temp.next;
        }
        
        k=k%count;
        temp.next=head;
        k=count-k-1;
        ListNode newNode=head;
        
        while(k-->0){
            newNode=newNode.next;
        }
        
        head=newNode.next;
        newNode.next = null;
        return head;
    }
}