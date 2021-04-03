class Solution {
    public boolean isPalindrome(String s) {
        char[] sArray = s.toLowerCase().toCharArray();
        
        int left = 0;
        int right = sArray.length - 1;
        
        while(left < right){
            Character first = sArray[left];
            Character second = sArray[right];
            if(!Character.isLetterOrDigit(first) || Character.isWhitespace(first)){
                left++;
                continue;
            }
            if(!Character.isLetterOrDigit(second)  || Character.isWhitespace(second)){
                right--;
                continue;
            }
            
            if(!first.equals(second)){
                return false;
            }
            
            left++;right--;
            
        }
        
        return true;
        
    }
}