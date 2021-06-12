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
        var set = HashSet<ListNode?>()
        
        
        var tmp = head
        while(tmp != null){
            if(!set.contains(tmp)){
                set.add(tmp)
            }
            else{
                return true
            }
            tmp = tmp.next
        }
        
        return false
        
        
    }
}