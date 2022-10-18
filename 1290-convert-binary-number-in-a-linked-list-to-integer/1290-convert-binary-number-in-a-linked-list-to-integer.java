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
    public int getDecimalValue(ListNode head) {
        int count =0;
        int result =0;
        ListNode temp = head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        temp = head;
        int power = count-1;
        while(temp!=null){
            result+=temp.val*Math.pow(2,power);
            temp=temp.next;
            power--;
        }
        
        return result;
        
    }
}