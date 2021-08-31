class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        
        val set = HashSet<Char>()
        var length = 0
        
        val sArray = s.toCharArray()
        
        var left = 0
        
        for(right in 0 until sArray.size){
            val current = sArray[right]
            while(set.contains(current) && left < right){
                set.remove(sArray[left++])
            }
            set.add(current)
            length = Math.max(length, (right - left) + 1)
        }
        
        return length
    }
}