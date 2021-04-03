class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        for(int i = 1;i < nums.length;i++){
            int one = nums[count];
            int two = nums[i];
            if(one != two){
                count++;
                nums[count] = two;
            }
        }   
        
        return count+1;
    }
}