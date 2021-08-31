class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        
        val set =  HashSet<Char>()
        var left = 0
        var length = 0
        val sArray = s.toCharArray()
        for(right in 0 until sArray.size ){
            
            while(set.contains(sArray[right]) && left < right){
                set.remove(sArray[left++])
            }
            length = Math.max(length, (right - left) + 1)
            set.add(sArray[right])
            
        }
        return length
    }
}