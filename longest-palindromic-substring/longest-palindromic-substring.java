class Solution {
    public String longestPalindrome(String s) {
        
        char[] sArray = s.toCharArray();
        int start = 0;
        int end = 0;
        
        for(int i = 0;i < sArray.length;i++){
            
            int lengthOne = expandAroundCenter(sArray,i, i);
            int lengthTwo = expandAroundCenter(sArray,i,i+1);
            int longest = Math.max(lengthOne, lengthTwo);
            
            if(longest > end - start ){
                start = i - (longest - 1)/2;
                end = i + longest/2;
            }
            
        }

        return s.substring(start,end+1);
    }
    
    public int expandAroundCenter(char[] sArray, int left, int right){
        int r = right;
        int l = left;
        while(l >= 0 && r < sArray.length && sArray[l] == sArray[r]){
            l--;
            r++;
        }
        return r - l - 1;
    }
}