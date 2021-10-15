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
        
        var tmpOne = l1
        var tmpTwo = l2
        
        while(tmpOne != null && tmpTwo != null){
           if(tmpOne.`val` > tmpTwo.`val`){
               merged.next = tmpTwo
               tmpTwo = tmpTwo?.next
           } 
           else{
               merged.next = tmpOne
               tmpOne = tmpOne?.next
           }
           merged = merged.next
        }
        
        merged.next = if(tmpOne != null) tmpOne else tmpTwo 
       
        
        return dummy.next
        
    }
}