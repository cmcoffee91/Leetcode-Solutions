class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<Character>();
        
        int longest = 0;
        char[] sArray = s.toCharArray();
        
        for(int right = 0, left = 0;right < sArray.length;right++){
            
            char current = sArray[right];
            
            while( set.contains(current) && left < right ){
                set.remove(sArray[left++]);
            }
            longest = Math.max(longest, (right - left) + 1);
            set.add(current);
        }
        
        return longest;
    }
}