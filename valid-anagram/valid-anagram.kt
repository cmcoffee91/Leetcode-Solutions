class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        
        if(s.length != t.length) return false
        
        val map = HashMap<Char, Int>()
        
        val sArray = s.toCharArray()
        val tArray = t.toCharArray()
        
        for(c in sArray) map[c] = map.getOrDefault(c, 0) + 1
        
        for(c in tArray){
            var current = map.getOrDefault(c, 0)
            if(current < 1) return false
            map[c] = --current
        }
        
        return true
        
    }
}