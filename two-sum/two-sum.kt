class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var map = HashMap<Int,Int>()
        
        for(i in 0 until nums.size){
            var complement = target - nums[i]
            map?.let{
               if(it.containsKey(complement)){
                    it[complement]?.let{ myVal ->
                        return intArrayOf(i, myVal)
                    }
                }
                else{
                    it[nums[i]] = i
                }
            }
            
        }
        
        return IntArray(2)
        
    }
}