public class Main{
    public static void main(String[] args) {
        
    }
}


class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode ptr = head;
        int count = 0;
        while(ptr.next != null){
            count++;
            ptr = ptr.next;
        }
        if(n == count+1) return head.next;
        ptr = head;
        for(int i = 0;i <= count - n - 1;i ++) ptr = ptr.next;
        ptr.next = ptr.next.next;
        return head;
    }
}