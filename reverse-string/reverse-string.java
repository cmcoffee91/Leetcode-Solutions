class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length -1;
        while(left < right){
            char first = s[left];
            char second = s[right];
            s[left] = second;
            s[right] = first;
            left++;
            right--;
        }
    }
}