class Solution {
    fun isAnagram(s: String, t: String): Boolean {
         val map = HashMap<Char, Int>()
         val sArray = s.toCharArray()
         val tArray = t.toCharArray()
         
         if(sArray.size != tArray.size) return false
         
         for(c in sArray){
             map[c] = map.getOrDefault(c, 0) + 1
         }
         
          for(c in tArray){
             var current = map.getOrDefault(c, 0)
             if(current  > 0){
               map[c] = --current  
             } 
             else{
                 return false
             }
         }
        
        return true
    }
}