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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null && n>0) return null;
        int cnt = 0;
        ListNode temp = head;
        ListNode d = new ListNode(-1);
        d.next = head;
        while(temp.next!=null){
            temp = temp.next;
            cnt++;
        }
        if(cnt<n) return head.next;
        int i=0;temp = head;
        ListNode prev = head.next;
        while(i < cnt-n){
            prev = prev.next;
            temp = temp.next;
            i++;
        }  
        temp.next = prev.next;

        return d.next;

    }
}
