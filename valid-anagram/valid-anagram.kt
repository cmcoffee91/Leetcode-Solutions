class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        
        if(s.length != t.length) return false
        val sArray = s.toCharArray()
        val tArray = t.toCharArray()
        
        val map = HashMap<Char, Int>()
        
        for(i in 0 until sArray.size){
            if(map.containsKey(sArray[i])){
              var current = map[sArray[i]]  
              current?.let{
                  var updateNum = it
                  map[sArray[i]] = ++updateNum
              }
            }
            else{
              map[sArray[i]] = 1
            }
        }
        
         for(i in 0 until tArray.size){
             if(map.containsKey(tArray[i])){
                 var current = map[tArray[i]]
                 current?.let{
                  var updateNum = it
                  updateNum--
                  if(updateNum < 0) return false
                  map[tArray[i]] = updateNum
                 }
             }
             else{
                 return false
             }
         }
         
        
        return true
    }
}