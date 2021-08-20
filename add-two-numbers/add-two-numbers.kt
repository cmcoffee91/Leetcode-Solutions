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
        val dummy = ListNode(-1)
        var current = dummy 
        var tmpOne = l1
        var tmpTwo = l2
        
        var carry = 0
        while(tmpOne != null || tmpTwo != null){
            val one = if (tmpOne != null) tmpOne.`val` else 0
            val two = if (tmpTwo != null) tmpTwo.`val` else 0
            val sum = one + two + carry
            carry = sum / 10
            println(carry)
            current.next = ListNode(sum % 10)
            current = current.next
            if(tmpOne != null)tmpOne = tmpOne.next
            if(tmpTwo != null)tmpTwo = tmpTwo.next
        }
        
        if(carry > 0) current.next = ListNode(carry)
        
        return dummy.next
    }
}