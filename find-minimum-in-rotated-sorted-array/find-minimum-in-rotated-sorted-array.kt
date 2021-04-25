class Solution {
    fun findMin(nums: IntArray): Int {
        
        if(nums.size == 1) return nums[0]
        
        var left = 0
        var right = nums.size - 1
        
        //if first element is smaller than the right element, there is no rotation
        if(nums[right] > nums[left]) return nums[0]
        
        while(left <= right){
            val mid = left + (right - left)/2;
            println(mid)
            
            if(nums[mid] > nums[mid + 1]) return nums[mid + 1]
            
            if(nums[mid - 1] > nums[mid]) return nums[mid]
            
            if(nums[mid] > nums[0]){
                left = mid + 1
            }
            else{
                right = mid - 1
            }
            
        }
        
        return -1
        
        
    }
}