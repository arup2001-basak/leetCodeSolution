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
    public ListNode partition(ListNode head, int x) {
       
        ListNode DammySmall = new ListNode(0);
        ListNode DammyHigh = new ListNode(0);
        
        ListNode small = DammySmall;
        ListNode high = DammyHigh;
        ListNode node = head;
        
        while(node != null){
            if(node.val < x){
                //small value
                small.next = node;
                small = small.next;
            }
            else{
                // high value
                high.next = node;
                high = high.next;
            }
            node = node.next;
        }
        
        high.next = null;
        small.next = DammyHigh.next;
        return DammySmall.next;
    }
}