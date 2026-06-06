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
    public ListNode reverseList(ListNode head) {
        Stack<Integer> st = new Stack<>();
        ListNode temp = head;
        while(temp!= null){
            st.push(temp.val);
            temp = temp.next;
        }
        ListNode dummy = new ListNode(-1);
        ListNode temp1 = dummy; 
        while(!st.isEmpty()){
            ListNode newNode = new ListNode(st.pop());
            temp1.next = newNode;
            temp1 = newNode;
        }
        return dummy.next;
    }
}