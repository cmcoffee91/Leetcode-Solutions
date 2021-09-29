class Solution {
    fun findKthLargest(nums: IntArray, k: Int): Int {
        //[3,2,1,5,6,4] k=2
        // pq   5 6
        
        nums.sort()
        return nums[nums.size - k]
    }
}