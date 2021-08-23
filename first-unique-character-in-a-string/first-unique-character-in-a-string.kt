class Solution {
    fun firstUniqChar(s: String): Int {
        val map = HashMap<Char, Int>()
        
        val sArray = s.toCharArray()
        for(c in sArray){
            map[c] = map.getOrDefault(c, 0) + 1
        }
        
        for(i in 0 until sArray.size){
            if( map[ sArray[i] ] == 1 ) return i
        }
        
        return -1
    }
}