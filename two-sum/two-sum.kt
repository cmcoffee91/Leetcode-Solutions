class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()
        for( i in 0 until nums.size){
            val complement = target - nums[i]
            map?.let{
                if(it.containsKey(complement)){
                    it[complement]?.let{num -> 
                        return intArrayOf(i, num)
                    }
                }
                else{
                    it[ nums[i] ] = i
                }
            }
            
        }
        
        return IntArray(2)
    }
}