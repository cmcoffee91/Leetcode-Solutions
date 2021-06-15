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
        var endOfFirstHalf = getEndOfFirstHalf(head)
        var secondHalfStart = reverseList(endOfFirstHalf?.next)
       
        var currentTmp = head
        var p2 = secondHalfStart
        while(p2 != null){
            if(p2?.`val` != currentTmp?.`val`) return false
            p2 = p2.next
            currentTmp = currentTmp.next
        }
        
        return true
    }
    
    fun getEndOfFirstHalf(head: ListNode?): ListNode?{
        var tmpFast = head
        var tmpSlow = head
        while(tmpFast?.next != null && tmpFast?.next.next != null){
                tmpFast = tmpFast?.next.next
                tmpSlow = tmpSlow?.next
        }
        
        return tmpSlow
    }
    
    fun reverseList(head: ListNode?): ListNode?{
        var tmp = head
        var prev: ListNode? = null
        while(tmp != null){
            var next = tmp.next
            tmp.next = prev
            prev = tmp
            tmp = next
        }
        
        return prev
    }
}