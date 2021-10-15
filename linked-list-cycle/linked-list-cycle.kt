/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun hasCycle(head: ListNode?): Boolean {
        
        var fast = head?.next
        var slow = head
        while(fast != null && fast.next != null){
            if(fast == slow) return true
            fast = fast?.next?.next
            slow = slow?.next
        }
        
        return false
    }
}