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
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var carry = 0
        var dummy = ListNode(-1)
        var current = dummy
        
        var tmpL1 = l1
        var tmpL2 = l2
        
        while(tmpL1 != null || tmpL2 != null){
            val one = if(tmpL1 != null) tmpL1.`val` else 0
            val two = if(tmpL2 != null) tmpL2.`val` else 0
            val sum = one + two + carry
            carry = sum / 10
            current.next = ListNode(sum % 10)
            if(tmpL1 != null)tmpL1 = tmpL1.next
            if(tmpL2 != null)tmpL2 = tmpL2.next
            current = current.next
        }
        
        if(carry > 0) current.next = ListNode(carry)
        return dummy.next
        
        
    }
}