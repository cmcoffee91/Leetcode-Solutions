class Solution {
    fun reverse(x: Int): Int {
        var result = 0L 
        var tmp = x
        while(tmp != 0){
            val remainder = tmp % 10
            result = result * 10 + remainder.toLong()
            if(result < Int.MIN_VALUE || result > Int.MAX_VALUE) return 0
            tmp /= 10 
        }
        
        return result.toInt()
    }
}