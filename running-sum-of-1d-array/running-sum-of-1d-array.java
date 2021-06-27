class Solution {
    public int[] runningSum(int[] nums) {
        
        int[] runningSum = nums;
        int sum = 0;
        
        for(int i = 0;i < nums.length;i++){
            int current = nums[i];
            sum += current;
            runningSum[i] = sum;
        }
        
        return runningSum;
        
    }
}