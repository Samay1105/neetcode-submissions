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
    public ListNode rev(ListNode head){
        if(head==null || head.next == null) return head;

        ListNode temp = head , prev = null;
        while(temp!=null){
            ListNode newNode = temp.next;
            temp.next = prev;
            prev = temp;
            temp = newNode;
        }
        return prev;
    }
    public ListNode merge(ListNode l1 , ListNode l2){
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        while(l1!=null || l2!=null){
            if(l1!=null){
                curr.next = l1;
                curr = curr.next;
                l1 = l1.next;
            }
            if(l2!=null){
                curr.next = l2;
                curr = curr.next;
                l2 = l2.next;
            }
        }
        return dummy.next;
    }
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode temp = rev(slow.next);
        slow.next = null;
        head = merge(head , temp);
    }
}
