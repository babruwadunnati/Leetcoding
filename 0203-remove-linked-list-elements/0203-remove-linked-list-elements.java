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
    public ListNode removeElements(ListNode head, int val) {
        ListNode prev = new ListNode();
        ListNode curr = new ListNode();
        if(head==null)
            return head;
        curr=head;
        prev=curr;
      
        while(curr!=null){
            if(curr.val==val){
                prev.next=curr.next;
                curr=curr.next;
            }else{
                prev=curr;
                curr=curr.next;
            }
            
        }
          if(head.val==val){
                head=head.next;
        }
        return head;
    }
}