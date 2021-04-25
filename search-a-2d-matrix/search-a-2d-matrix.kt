class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        
        var colSize = matrix.size - 1
        var rowSize = matrix[0].size - 1
        
        var rowToSearch = 0
        
        for(i in 0..colSize){
            var firstVal = matrix[i][0]
                var lastVal = matrix[i][rowSize]
                if(firstVal == target || lastVal == target) return true
            
                //if target is smaller than the last value in this row, 
                //the target is possibly in the row
                if(target < lastVal){
                    var left = 1
                    var right = rowSize - 1
                    while(left <= right){
                        val rowMidIndex = left + (right - left)/2
                        if(matrix[i][rowMidIndex] == target){
                            return true
                        }
                        else if(matrix[i][rowMidIndex] < target){
                            left = rowMidIndex + 1
                        }
                        else{
                            right = rowMidIndex - 1
                        }
                    }
                    
                }
            
        }
        
        return false
        
    }
    
    
}