class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        
        for(int currentNumber : nums){
            if(set.contains(currentNumber)) return true;
            set.add(currentNumber);
        }
        
        return false;
        
    }
}