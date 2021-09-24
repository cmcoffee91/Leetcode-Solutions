class Solution {
    fun findKthLargest(nums: IntArray, k: Int): Int {
        val pq = PriorityQueue<Int>{ a: Int,b: Int -> a - b }
        for(num in nums){
            pq.offer(num)
            if(pq.size > k)pq.poll()
        }
        return pq.peek()
    }
}