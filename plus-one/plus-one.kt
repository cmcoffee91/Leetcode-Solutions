class Solution {
    fun plusOne(digits: IntArray): IntArray {
        
        var carry = 1
        for(i in digits.size-1 downTo 0){
            
            val current = digits[i] 
            val sum = current + carry
            carry = sum / 10
            digits[i] = sum % 10
            
        }
        
        if(carry > 0){
            val increasedArray = IntArray(digits.size + 1)
            increasedArray[0] = carry
            for(i in 0 until digits.size){
                increasedArray[i+1] = digits[i]
            }
            
            return increasedArray
        }
        
        return digits
        
    }
}