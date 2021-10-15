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
    fun isPalindrome(head: ListNode?): Boolean {
        
        var middle = getMiddleNode(head)
        var reversedLastHalf = reverseList(middle?.next)
        
        var tmp = head
        while(reversedLastHalf != null){
            if(reversedLastHalf?.`val` != tmp?.`val`) return false
            reversedLastHalf = reversedLastHalf?.next
            tmp = tmp?.next
        }
        
        return true
        
        
    }
    
    
    fun reverseList(head: ListNode?): ListNode?{
        var prev:ListNode? = null
        var tmp = head
        
        while(tmp != null){
            val next = tmp.next
            tmp.next = prev
            prev = tmp
            tmp = next
        }
        return prev
    }
    
    
    fun getMiddleNode(head: ListNode?):ListNode?{
        var slow = head 
        var fast = head?.next
        while(fast != null && fast?.next != null){
            fast = fast?.next?.next 
            slow = slow?.next
        }
        return slow
    }
    
    
}