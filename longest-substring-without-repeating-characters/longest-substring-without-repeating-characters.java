class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        Set<Character> set = new HashSet<>();
        char[] sArray = s.toCharArray();
        int length = sArray.length;
        int max = 0;
        int left = 0;
        for(int right = 0;right < length;right++){
            char current = sArray[right];
            
            while( set.contains(current) ){
                set.remove(sArray[left++]);
            }
            max = Math.max(max, (right - left) + 1);
            set.add(current);
        }
        return max;
    }
}