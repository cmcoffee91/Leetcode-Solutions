class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        char[] sChars = s.toCharArray();
        for(Character c : sChars){
            int count = map.getOrDefault(c, 0);
            map.put(c, count + 1);
        }
        for(Character c : sChars){
            if(map.get(c) == 1) return s.indexOf(c);
        }
        return -1;
    }
}