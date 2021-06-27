class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        if(nums.length == 1 && nums[0] == target) return new int[]{0,0};
        
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left)/2;
            
            if(nums[mid] == target){
                int first = mid;
                int last = mid;
                while(first != 0 && nums[first-1] == target)first--;
                while(last != right && nums[last+1] == target)last++;
                return new int[]{first,last};
            }
            else if(nums[mid] > target){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        
        return new int[]{-1,-1};
    }
}