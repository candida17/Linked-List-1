// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
Create a dummy node and point slow and fast pointer to this node
for given n move the fast by one until count reaches n so that fast is always ahead of the node to be removed
Move the slow pointer by 1 such that slow is one node behind the node to be removed
with a help of temp node delete the nth node
*/
class Solution {
    public ListNode reverseList(ListNode head) {
        return helper(head, null);
        
    }
    private ListNode helper(ListNode curr, ListNode prev) {
        //base
        if(curr == null) return prev;
        //logic
        ListNode temp = curr.next;
        curr.next = prev;
        prev = curr;
        curr = temp;
        return helper(curr, prev);
    }
}
