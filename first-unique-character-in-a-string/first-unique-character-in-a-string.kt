class Solution {
    fun firstUniqChar(s: String): Int {
        
        val map = HashMap<Char,Int>()
        val sArray = s.toCharArray()
        for(i in 0 until sArray.size){
            
            if( map.containsKey( sArray[i] ) ) {
                map[ sArray[i] ]?.let{ myVal ->
                    var currentCount = myVal
                    map[ sArray[i] ] = ++currentCount
                }
                
            }
            else
            {
                map.put(sArray[i],1)
            }
        }
        
        for(i in 0 until sArray.size){
            val count = map[ sArray[i] ]
            if(count == 1) return i
        }
        
        return -1
        
    }
}