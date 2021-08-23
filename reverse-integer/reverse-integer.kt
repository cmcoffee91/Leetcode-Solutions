class Solution {
    fun reverse(x: Int): Int {
        var result = 0 
        var tmp = x
        while(tmp != 0){
            val remainder = tmp % 10
            if(result > Int.MAX_VALUE / 10 || result == Int.MAX_VALUE / 10 && remainder > 7) return 0
            if(result < Int.MIN_VALUE / 10 || result == Int.MIN_VALUE / 10 && remainder < -8) return 0
            tmp /= 10 
            result = result * 10 + remainder
        }
        
        return result.toInt()
    }
}