class Solution {
    fun singleNumber(nums: IntArray): Int {
        
        val map = mutableMapOf<Int, Int>()
        
        nums.forEachIndexed{ index, num ->
            map[num] = map.getOrDefault(num, 0) + 1
        }
        
        for( num in nums ){
            if(map[num] == 1) return num
        }
        
        return -1
        
    }
}