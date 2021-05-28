class Solution {
    fun plusOne(digits: IntArray): IntArray {
       var carry = 1
       for(i in digits.size-1 downTo 0){
           var current = digits[i]
           current += carry
           carry = current / 10
           digits[i] = current % 10
       } 
       if(carry > 0){
           var increasedArray = IntArray(digits.size+1)
           increasedArray[0] = carry
           for(i in 1..increasedArray.size-1){
               increasedArray[i] = digits[i-1]
           }
           return increasedArray
       }
       return digits
    }
}