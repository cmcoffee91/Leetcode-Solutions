class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        
        val set = HashSet<Int>()
        nums.forEach{ current ->
            if(set.contains(current)) return true
            set.add(current)
        }
        
        return false
    }
}