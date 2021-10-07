class Solution {
    fun singleNumber(nums: IntArray): Int {
        val map = HashMap<Int, Int>()
        
        nums.forEach{ num ->
            if(map.containsKey(num)){
                map.get(num)?.let{
                    map[num] = it + 1
                }
            }
            else{
                map[num] = 1
            }
        }
        
        nums.forEach{ num ->
            if(map.get(num) == 1) return num
        }
        
        return -1
        
    }
}