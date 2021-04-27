class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        if(matrix == null) return false;
        
        int colSize = matrix.length;
        int rowSize = matrix[0].length - 1;
        
        for(int i = 0; i < colSize;i++){
            if(matrix[i][0] == target || matrix[i][rowSize] == target) return true;
            if(target < matrix[i][rowSize]){
                int left = 1;
                int right = rowSize - 1;
                while(left <= right){
                    int middle = left + (right - left)/2;
                    if(matrix[i][middle] == target) return true;
                    if(matrix[i][middle] < target){
                        left = middle + 1;
                    }
                    else{
                        right = middle - 1;
                    }
                }
            }
            
        }
        
        return false;
    }
}