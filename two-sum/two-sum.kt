class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()
        
        
        nums.forEachIndexed{ index, num ->
            val complement = target - num
            if(map.containsKey(complement)){
                map[complement]?.let{
                    return intArrayOf(it, index)
                }
            }
            else{
                map.put(num, index)
            }
        }
        
        return intArrayOf(-1,-1)
    }
}