class Solution {
    public String longestPalindrome(String s) {
        char[] sArray = s.toCharArray();
        int left = 0, right = 0;
        for(int i = 0;i < sArray.length;i++){
           int lengthOne = expandAroundCenter(sArray, i, i); 
           int lengthTwo = expandAroundCenter(sArray, i, i+1); 
           int longest = Math.max(lengthOne, lengthTwo);
            
           if(longest > right - left){
               left = i - ((longest - 1) / 2);
               right = i + (longest / 2);
           }
        }
       return s.substring(left, right + 1);
    }
    
    public int expandAroundCenter(char[] sArray, int left, int right){
        while (left >= 0 && right < sArray.length && sArray[left] == sArray[right]){
            right++;
            left--;
        }
        return right - left - 1;
    }
    
    
    
}