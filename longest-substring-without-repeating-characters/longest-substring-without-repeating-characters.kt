class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        
        var longest = 0
        var left = 0
        
        val set = HashSet<Char>()
        
        for(right in 0 until s.length){
            var current = s[right]
            while(set.contains(current) && left < right){
                set.remove(s[left++])
            }
            set.add(current)
            longest = Math.max(longest, (right - left) + 1)
            
        }
        return longest
    }
}