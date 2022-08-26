public class Main {
    public void main(String[] args) {
        ;
    }
}


public class ListNode {
    public int val;
    public ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode();
        ListNode ptr = res;
        int carry = 0;
        while(l1 != null & l2 != null){
            ListNode tmp = new ListNode();
            tmp.val = l1.val + l2.val + carry;
            carry = 0;
            if(tmp.val >= 10){
                tmp.val -= 10;
                carry = 1;
            }
            ptr.next = tmp;
            ptr = tmp;
            l1 = l1.next;l2 = l2.next;
        }
        while(l1 != null){
            ListNode tmp = new ListNode();
            tmp.val = l1.val + carry;
            carry = 0;
            if(tmp.val >= 10){
                tmp.val -= 10;
                carry = 1;
            }
            ptr.next = tmp;
            ptr = tmp;
            l1 = l1.next;
        }
        while(l2 != null){
            ListNode tmp = new ListNode();
            tmp.val = l2.val + carry;
            carry = 0;
            if(tmp.val >= 10){
                tmp.val -= 10;
                carry = 1;
            }
            ptr.next = tmp;
            ptr = tmp;
            l2 = l2.next;
        }
        if(carry == 1){
            ListNode tmp = new ListNode();
            tmp.val = 1;
            ptr.next = tmp;
        }
        return res.next;
    }
}
