class Solution {
    fun isValid(s: String): Boolean {
        val sArray = s.toCharArray()
        val map = mutableMapOf<Char,Char>()
        val stack = Stack<Char>()
        
        map['}'] = '{'
        map[']'] = '['
        map[')'] = '('
        
        sArray.forEach{
            if(map.containsKey(it)){
                if(stack.isEmpty() || map[it] != stack.pop()) return false
            }
            else{
                stack.push(it)
            }
        }
        if(stack.isNotEmpty()) return false
        return true
    }
}