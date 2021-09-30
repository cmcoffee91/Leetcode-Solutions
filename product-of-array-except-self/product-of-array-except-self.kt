class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        
        val length = nums.size
        
        val left = IntArray(length)
        val right = IntArray(length)
        
        val answer = IntArray(length)
        
        left[0] = 1
        right[nums.size - 1] = 1
        
        for(i in 1 until length){
            left[i] = nums[i - 1] * left[i - 1]
        }
        
        for(i in length-2 downTo 0 ){
            right[i] = nums[i + 1] * right[i + 1]
        }
        
        for(i in 0 until nums.size){
            answer[i] = left[i] * right[i]
        }
        
        return answer
        
    }
}