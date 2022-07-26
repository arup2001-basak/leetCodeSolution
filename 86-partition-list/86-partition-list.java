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
        ListNode DummySmall = new ListNode(0);
        ListNode DummyBig = new ListNode(0);
        
        ListNode small = DummySmall, big = DummyBig;
        ListNode node = head;
        
        while(node != null){
            if(node.val < x){
                //small node
                small.next = node;
                small = small.next;
            }
            else{
                //big node
                big.next = node;
                big = big.next;
            }
            node = node.next;
        }
        big.next = null;
        small.next = DummyBig.next;
        return DummySmall.next;
    }
}