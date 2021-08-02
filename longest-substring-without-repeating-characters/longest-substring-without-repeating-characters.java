class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int longest = 0;
        char[] sArray = s.toCharArray();
        for(int left = 0, right = 0;right < sArray.length;right++){
            char current = sArray[right];
            while(set.contains(current) && left < right){
                set.remove(sArray[left++]);
            }
            longest = Math.max(longest, ( right - left ) + 1);
            set.add(current);
        }
        return longest;
    }
}