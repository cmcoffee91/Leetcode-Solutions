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
        
        var tmp = head
        var firstHalf = getFirstHalf(tmp)
        var reversed = reverseList(firstHalf?.next) 
        
        while(reversed != null){
            if(tmp?.`val` != reversed?.`val`) return false
            reversed = reversed?.next
            tmp = tmp?.next
        }
        
        return true
    }
    
    fun getFirstHalf(head: ListNode?): ListNode? {
        var tmp = head
        var slow = tmp
        var fast = tmp
        
        while(fast?.next != null && fast?.next?.next != null){
            fast = fast?.next?.next
            slow = slow?.next
        }
        return slow
    }
    
    
    fun reverseList(head: ListNode?): ListNode? {
       
        var tmp = head
        var prev: ListNode? = null
        
        while(tmp != null){
            val next = tmp.next
            tmp.next = prev
            prev = tmp 
            tmp = next
        }
        return prev
    }
}