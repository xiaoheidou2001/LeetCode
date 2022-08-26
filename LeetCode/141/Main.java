/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Main{
    public static void main(String[] args) {
        
    }
}

class Solution {
    public boolean hasCycle(ListNode head) {
        while(head != null){
            if(head.val != 100001){
                head.val = 100001;
                head = head.next;
            } else return true;
        }
        return false;
    }
}