class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        
        var map = HashMap<Char,Int>()
        var left = 0
        var longest = 0
        
        var sArray = s.toCharArray()
        
        for(i in 0 until sArray.size){
            val currentChar = sArray[i]
            
            
            map[currentChar]?.let{ currentIndex ->
                left = Math.max( left, currentIndex )
            }
            
            longest = Math.max( longest, i - left + 1 )
            map[currentChar] = i + 1
            
            
        }
        
        return longest
    }
}