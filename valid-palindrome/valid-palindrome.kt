class Solution {
    fun isPalindrome(s: String): Boolean {
        val sArray = s.toLowerCase().toCharArray()
        var left = 0
        var right = sArray.size-1
        while(left < right){
           val first = sArray[left];
           val second = sArray[right];
           if( !first.isLetterOrDigit() )  {
               left++
               continue
           }
           else if( !second.isLetterOrDigit() )  {
               right--
               continue
           }
           else if( first != second ){
               return false
           }
           left++
           right--
        }
        return true
    }
}