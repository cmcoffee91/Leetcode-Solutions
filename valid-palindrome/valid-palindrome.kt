class Solution {
    fun isPalindrome(s: String): Boolean {
        
        val sArray = s.toLowerCase().toCharArray()
        
        var left = 0
        var right = sArray.size-1

        while(left < right){
           var first = sArray[left] 
           var second = sArray[right] 
           if(!first.isLetterOrDigit()){
               left++
               continue
           }  
           if(!second.isLetterOrDigit()){
               right--
               continue
           }  
           
           if(first != second) return false
            
           left++
           right--
        }
        

        return true;

        
    }
}