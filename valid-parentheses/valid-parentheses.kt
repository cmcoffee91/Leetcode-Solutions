class Solution {
    fun isValid(s: String): Boolean {
        
        if(s.length < 2) return false


        val map = mutableMapOf<Char,Char>()
        val stack = Stack<Char>()
        
        map['}'] = '{'
        map[']'] = '['
        map[')'] = '('
        
        
        val sArray = s.toCharArray()
        sArray.forEach{
            if(map.containsKey(it) && stack.isNotEmpty()){
                if(map[it] != stack.pop()) return false
            }
            else{
                stack.push(it)
            }
        }
        
        if(stack.isNotEmpty()) return false

        return true
    }
}