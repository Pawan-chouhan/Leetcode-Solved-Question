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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode t1=list1 ,t2=list2;
        ListNode ans =new ListNode();
        ListNode dmy = ans;
        while(t1!=null&&t2!=null){
            if(t1.val<=t2.val){
                
                ans.next=t1;
                t1 = t1.next;
            }
            else{
               
                ans.next=t2;
                 t2=t2.next;
                }
                ans = ans.next;
                
        }
        if(t1!=null){
             ans.next=t1;
        }
        else {
        ans.next=t2;}
        return dmy.next;

    }
}