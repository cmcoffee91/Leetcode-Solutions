/* The isBadVersion API is defined in the parent class VersionControl.
      def isBadVersion(version: Int): Boolean = {} */

class Solution: VersionControl() {
    override fun firstBadVersion(n: Int) : Int {
        var left = 0
        var right = n
        while(left < right){
            val mid = left + (right - left)/2
            
            if(isBadVersion(mid) && !isBadVersion(mid-1)){
                return mid
            }
            else if(isBadVersion(mid)){
               right = mid -1
            }
            else{
                left = mid + 1
            }
            
        }
        
        return  left
        
	}
}