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
        
        //Solution 1
//         ListNode prev = new ListNode();
//         ListNode curr = new ListNode();
//         if(head==null)
//             return head;
//         curr=head;
//         prev=curr;
      
//         while(curr!=null){
//             if(curr.val==val)
//                 prev.next=curr.next;
//             else
//                 prev=curr;
//             curr=curr.next;
            
//         }
//           if(head.val==val){
//                 head=head.next;
//         }
//         return head;
        
        //Solution 2
        // while(head!=null && head.val==val)
        //     head=head.next;
        // ListNode curr = new ListNode();
        // curr = head;
        // while(curr!=null&&curr.next!=null){
        //     if(curr.next.val==val)
        //         curr.next = curr.next.next;
        //     else
        //         curr=curr.next;
        // }
        // return head;
        
        //Solution 3 using recursion
        if(head==null)
            return null;
        head.next = removeElements(head.next,val);
        if(head.val==val){
            return head.next;
        }else{
            return head;
        }
    }
}