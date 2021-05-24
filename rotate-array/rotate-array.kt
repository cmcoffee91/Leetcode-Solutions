class Solution {
    fun rotate(nums: IntArray, k: Int): Unit {
        val map =  HashMap<Int, Int>()
        nums.forEachIndexed{ index, value ->
              map.put((index+k) % nums.size, value)
        }
        
        nums.forEachIndexed{ index, value ->
            map[index]?.let{
                nums[index] = it
            }
              
        }
    }
}