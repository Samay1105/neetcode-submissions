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
        ListNode newNode = new ListNode();
        ListNode l2 = newNode;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                l2.next = list1;
                list1 = list1.next;
            }
            else{
                l2.next = list2;
                list2 = list2.next;
            }
            l2 = l2.next;
        }
        if(list1!=null) l2.next = list1;
        if(list2!=null) l2.next = list2;

        return newNode.next;
    }
}