class Solution {
    fun findKthLargest(nums: IntArray, k: Int): Int {
        
        //Input: nums = [3,2,1,5,6,4], k = 2
        //Output: 5
        
        //   5 6
        
        val pq = PriorityQueue<Int>()
        for(num in nums){
            pq.add(num)
            if(pq.size > k) pq.poll()
        }
        
        return pq.poll()
    }
}