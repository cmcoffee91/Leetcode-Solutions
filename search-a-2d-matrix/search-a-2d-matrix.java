class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowSize = matrix[0].length-1;
        int colSize = matrix.length;
        
        for(int i = 0;i < colSize;i++){
            
            if( matrix[i][0] == target || matrix[i][rowSize] == target ) return true;
            
            int left = 0;
            int right = rowSize;
            
            while(left <= right){
                int mid = left + (right - left)/2;
                if(matrix[i][mid] == target){
                    return true;
                }
                else if(matrix[i][mid] > target){
                    right = mid - 1;
                }
                else{
                    left = mid + 1;
                }
            }
            
        }
        
        return false;
    }
}