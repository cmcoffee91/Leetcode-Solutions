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
    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
        
        val dummy = ListNode(-1)
        
        var merged = dummy
        
        var one = l1
        var two = l2
        
        while(one != null && two != null){
            if(one.`val` < two.`val`){
                merged.next = one
                one = one.next
            }
            else{
                merged.next = two
                two = two.next
            }
            merged = merged.next
        }
        
        merged.next = if(one != null) one else two
        
        return dummy.next
    
        
    }
}