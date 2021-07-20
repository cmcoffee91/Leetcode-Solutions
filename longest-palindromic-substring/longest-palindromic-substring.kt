class Solution {
    fun longestPalindrome(s: String): String {
        
        val sArray = s.toCharArray()
        var start = 0
        var end = 0
        for(i in 0 until sArray.size){
            val lengthOne = expandAroundCenter(sArray, i, i)
            val lengthTwo = expandAroundCenter(sArray, i, i+1)
            val longest = Math.max(lengthOne, lengthTwo)
            if(longest > end - start ){
                start = i - (longest - 1)/2
                end = i + longest/2
            }
        }
        return s.substring(start, end+1)
    }
    
    fun expandAroundCenter(sArray: CharArray, left: Int, right: Int):Int{
        
        var r = right
        var l = left
        while(l >= 0 && r < sArray.size && sArray[l] == sArray[r]){
            l--
            r++
        }
        
        return r - l - 1
        
    }
}