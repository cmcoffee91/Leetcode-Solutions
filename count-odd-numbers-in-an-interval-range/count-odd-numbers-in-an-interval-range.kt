class Solution {
    fun countOdds(low: Int, high: Int): Int {
        
        var oddCount = 0
        var start = low
        while(start <= high){
            if(start % 2 != 0)oddCount++
            start++
        }
        
        return oddCount
    }
}