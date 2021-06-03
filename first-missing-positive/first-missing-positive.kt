class Solution {
    fun firstMissingPositive(nums: IntArray): Int {
        nums.sort()
        var firstPositive = 1
        for(i in 0 until nums.size){
            if(nums[i] > 0){
                if(firstPositive == nums[i]) firstPositive++
            }
        }
        
        
        
        return firstPositive
    }
}

//-1, 1, 3, 4