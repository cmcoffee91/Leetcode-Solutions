class Solution {
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0;i < length;i++){
            int current = nums[i]; 
            map.put((i+k) % length, current);
        }
        
        for(int i = 0;i < length;i++){
            nums[i] = map.get(i);
        }
    }
}