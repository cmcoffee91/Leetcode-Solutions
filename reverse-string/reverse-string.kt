class Solution {
    fun reverseString(s: CharArray): Unit {
        
        var left = 0
        var right = s.size-1
        while(left < right){
            val first = s[left]
            val second = s[right]
            s[right--] = first
            s[left++] = second
        }
    }
}