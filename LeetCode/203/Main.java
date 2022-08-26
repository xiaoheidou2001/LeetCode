import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String args[]){
        int[] vals = {6,6,1,2,6,6,3,4,5,6,6};
        int val = 6;
        ListNode head = ListNode.createList(vals);
        System.out.println(ListNode.toArrayList(head));
        System.out.println(ListNode.toArrayList(new Solution().removeElements(head, val)));
    }
}

class ListNode{
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {this.val = val;}
    ListNode(int val,ListNode next) {this.val = val;this.next = next;}

    public static ListNode createList(int[] vals){
        ListNode head = new ListNode(vals[vals.length-1]);
        for(int i = vals.length - 2;i >= 0;i --){
            head = new ListNode(vals[i], head);
        }
        return head;
    }

    public static List<Integer> toArrayList(ListNode head){
        if(head == null) return null;
        List<Integer> arrayList = new ArrayList<>();
        while(head != null){
            arrayList.add(head.val);
            head = head.next;
        }
        return arrayList;
    }

    // public static int[] toArray(ListNode head){
    //     List<Integer> arrayList = toArrayList(head);
    //     // TODO
    // }
}

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        head = new ListNode(val+1,head);
        ListNode newNode = head;
        while(head != null && head.next != null){
            ListNode tmpNode = head.next;
            while(tmpNode != null && tmpNode.val == val){
                tmpNode = tmpNode.next;
            }
            head.next = tmpNode;
            head = tmpNode;
        }
        return newNode.next;
    }
}