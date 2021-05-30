class Solution {
    fun runningSum(nums: IntArray): IntArray {
        var sum = 0
        for(i in 0 until nums.size){
            val currentNum = nums[i]
            nums[i] += sum
            sum += currentNum
        }
        
        return nums
    }
}