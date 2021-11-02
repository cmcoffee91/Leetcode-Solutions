class Solution {
    fun isValid(s: String): Boolean {
        
        if(s.length < 2) return false
        
        val openBrackets = listOf('[', '{', '(')
        val closingBrackets = listOf(']', '}', ')')
        
        val map = HashMap<Char, Char>()
        for(i in 0 until openBrackets.size){
            map.put(closingBrackets[i], openBrackets[i])
        }
        
        
        val stack = Stack<Char>()
        val sArray = s.toCharArray()
        
        sArray.forEach{
           if(openBrackets.contains(it)){
               stack.push(it)
           } 
           else if(closingBrackets.contains(it)){
               if(stack.size == 0 || map[it] != stack.pop()  ) return false
           }
        }
        
        if(stack.size > 0) return false
        
        return true
    }
}