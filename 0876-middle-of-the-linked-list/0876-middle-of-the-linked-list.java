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
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int size=0;
        while(temp!=null){
          temp=   temp.next;
          size++;
        }
        int mid  = size/2;
        ListNode t= head;
        
        while(mid>0){
            t=t.next;
           mid--;
        }
       return t;

    }
}