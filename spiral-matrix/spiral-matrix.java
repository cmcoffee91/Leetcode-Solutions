class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<Integer>();
        
        if(matrix == null || matrix.length == 0) return list;
        
        int left = 0;
        int top = 0;
        int right = matrix[0].length - 1;
        int bottom = matrix.length - 1;
        
        int size = matrix.length * matrix[0].length;
        
        while(list.size() < size){
           //add top most values from left most side going right
           int i = left;
           while( i <= right && list.size() < size){
               list.add( matrix[top][i++] );  
           }
           //move top down a row by incrementing
           top++;
            
           //add right most column going down to bottom most row
           i = top;
           while( i <= bottom && list.size() < size){
               list.add( matrix[i++][right] );  
           }
           //move right most column over once to the left 
           right--;
            
           //add bottom most column going left until left most column 
           i = right;
           while( i >= left && list.size() < size){
               list.add( matrix[bottom][i--] );  
           }
           //move bottom most column up one by decrementing
           bottom--;
            
           //move up on left most column until top most column, starting at bottom most
           i = bottom;
           while( i >= top && list.size() < size){
               list.add( matrix[i--][left] );  
           }
           //move left over one 
           left++; 
            
        }
        
        return list;
    }
}