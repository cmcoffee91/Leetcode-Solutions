class Solution {
    fun reverseString(s: CharArray): Unit {
        var left = 0
        var right = s.size - 1
        
        while(left < right){
            val leftVal = s[left]
            val rightVal = s[right]
            s[left++] = rightVal
            s[right--] = leftVal
        }
    }
}