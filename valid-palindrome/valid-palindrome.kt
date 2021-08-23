class Solution {
    fun isPalindrome(s: String): Boolean {
        
        val sArray = s.toLowerCase().toCharArray()
        
        var left = 0
        var right = sArray.size - 1
        
        while(left < right) {
            val leftVal = sArray[left]
            val rightVal = sArray[right]
            
            if( !leftVal.isLetterOrDigit() ){
                left++
                continue
            }
            else if( !rightVal.isLetterOrDigit() ){
                right--
                continue
            }
            else if(leftVal != rightVal) {
               return false 
            }
            left++
            right--
        }
        
        return true
        
    }
}