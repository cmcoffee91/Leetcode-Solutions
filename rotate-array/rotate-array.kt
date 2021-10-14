class Solution {
    fun rotate(nums: IntArray, k: Int): Unit {
        
        
        var rotateCount = k % nums.size
        reverseArray(0, nums.size - 1, nums)
        reverseArray(0, rotateCount - 1, nums)
        reverseArray(rotateCount, nums.size - 1, nums)
        
    }
    
    
    fun reverseArray(startIndex: Int, endIndex: Int, nums: IntArray){
        
        var left = startIndex
        var right = endIndex 
        
        while(left < right){
            var first = nums[left]
            var second = nums[right]
            nums[left++] = second
            nums[right--] = first
        }
        
    }
    
}