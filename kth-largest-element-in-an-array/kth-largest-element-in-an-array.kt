class Solution {
    fun findKthLargest(nums: IntArray, k: Int): Int {
        
        //[3,2,1,5,6,4]
        // 5 6 
        
        val pq = PriorityQueue<Int>()
        for(num in nums){
            pq.offer(num)
            if(pq.size > k)pq.poll()
        }
        return pq.peek()
    }
}