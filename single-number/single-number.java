class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int num : nums){
            int count = map.getOrDefault(num, 0);
            map.put(num, count + 1);
        }
        for(int num : nums){
            if(map.get(num) == 1) return num;
        }
        
        return -1;
    }
}