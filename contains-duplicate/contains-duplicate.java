class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int currentNum : nums){
            int count = map.getOrDefault(currentNum,0);
            map.put(currentNum, count+1);
        }
        
        for(int currentNum : nums){
            int count = map.get(currentNum);
            if(count > 1) return true;
        }
        return false;
    }
}