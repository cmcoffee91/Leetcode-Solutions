class Solution {
    public int findMin(int[] nums) {
        if(nums.length == 1) return nums[0];
        
        int left = 0;
        int right = nums.length - 1;
        if(nums[right] > nums[left]) return nums[left];
        
        while(left <= right){
            int mid = left + (right - left)/2;
            
            int current = nums[mid];
            if(current > nums[mid + 1]) return nums[mid + 1];
            if(current < nums[mid - 1]) return current;
            
            if(current > nums[0]){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        
        return -1;
       
    }
}