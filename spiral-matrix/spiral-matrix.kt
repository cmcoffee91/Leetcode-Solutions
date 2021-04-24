class Solution {
    fun spiralOrder(matrix: Array<IntArray>): List<Int> {
        val list = ArrayList<Int>()
        if(matrix == null || matrix.size == 0) return list
        
        var left = 0
        //the right most column will be found using nested arrays
        var right = matrix[0].size - 1
        //the bottom most row will be found using the matrix size
        var bottom = matrix.size - 1
        var top = 0
        
        //make sure to set using matrix
        val size = matrix.size * matrix[0].size
        
        while(list.size < size) {
            //go right on the top most row, starting on the left most column
            var i = left
            while( i <= right && list.size < size){
                list.add(matrix[top][i])
                i++
            }
            top++
            
            //go down on the right most column, starting on the top most column
            i = top
            
            while( i <= bottom && list.size < size){
                list.add(matrix[i][right])
                i++
            }
            right--
            
            //go left on the bottom most row, starting at the right most row
            i = right
            while( i >= left && list.size < size){
                list.add(matrix[bottom][i])
                i--
            }
            bottom--
            
            //go up from the bottom most row, starting on the left most column
            i = bottom
            while( i >= top && list.size < size){
                list.add(matrix[i][left])
                i--
            }
            left++
                
        }
        
        return list
        
    }
}