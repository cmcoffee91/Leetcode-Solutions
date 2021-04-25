class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var count = 1
        var currentPos = 0
        for(i in 1..nums.size-1){
            val secondNum = nums[i]
            if(secondNum > nums[currentPos]){
                count++
                currentPos++
                nums[currentPos] = secondNum 
            } 
        }
        
        return count
        
    }
}