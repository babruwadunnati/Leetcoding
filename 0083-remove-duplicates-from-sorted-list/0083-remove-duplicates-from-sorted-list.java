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
    public ListNode deleteDuplicates(ListNode head) {
        int[] visited = new int[201];
        if(head==null) return head;
        ListNode temp  = new ListNode();
        ListNode prev  = new ListNode();
        temp = head;
        prev = temp;
        int dup=0;
        if(head.val<0) visited[head.val+201]=1;
            else 
                visited[head.val]=1;
      //  visited[head.val]=1;
        while(temp!=null){
            if(temp.val<0)
                dup=temp.val+201;
            else 
                dup = temp.val;
            if(visited[dup]!=0){
                prev.next= temp.next;
                
            }else{
                visited[dup]=1;
                prev=prev.next;
            }
            temp = temp.next;
        }
        // if((temp.next==null)&&(visited[temp.val]!=0)){
        //     System.out.println("Temp value chanigng");
        //     temp=null;
        // }
        return head;
    }
}