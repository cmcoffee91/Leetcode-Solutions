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
        var dummy = ListNode(-1)
        var l1Tmp = l1
        var l2Tmp = l2
        var tmp = dummy
        while(l1Tmp != null && l2Tmp != null){
            val valOne = l1Tmp.`val`
            val valTwo = l2Tmp.`val`
            if(valOne < valTwo){
                tmp?.next = ListNode(valOne)
                l1Tmp = l1Tmp?.next
            }
            else{
                tmp?.next = ListNode(valTwo)
                l2Tmp = l2Tmp?.next
            }
            tmp = tmp.next
        }
        
        while(l1Tmp != null){
            tmp.next = ListNode(l1Tmp.`val`)
            l1Tmp = l1Tmp?.next
            tmp = tmp?.next
        }
        
        while(l2Tmp != null){
            tmp.next = ListNode(l2Tmp.`val`)
            l2Tmp = l2Tmp?.next
            tmp = tmp?.next
        }
        
        return dummy.next
    }
}