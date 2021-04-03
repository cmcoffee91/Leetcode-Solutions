class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        
        for(Character c : sArray){
            int count = map.getOrDefault(c, 0);
            map.put(c, count + 1);
        }
        
        for(Character c : tArray){
            if(map.containsKey(c)){
                int count = map.get(c);
                count--;
                if(count < 0) return false;
                map.put(c, count);
            }
            else{
                return false;
            }
           
        }
        
        
        return true;
    }
}