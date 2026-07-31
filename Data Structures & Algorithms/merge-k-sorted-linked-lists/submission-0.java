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
    public ListNode merge(ListNode l1 , ListNode l2){
        ListNode list1 = new ListNode();
        ListNode list = list1;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                list.next = l1;
                l1 = l1.next;
            }
            else{ list.next = l2;
                  l2 = l2.next;
            }

            list = list.next;
        }
        if(l1!=null) list.next = l1;

        else list.next = l2;

        return list1.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0) return null;
        ListNode head = lists[0];
        for(int i=1;i<lists.length;i++){
            head = merge(head , lists[i]);
        }
        return head;
    }
}
