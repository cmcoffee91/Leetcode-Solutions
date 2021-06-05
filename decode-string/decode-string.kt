class Solution {
    fun decodeString(s: String): String {
        
        val stringStack = Stack<StringBuilder>()
        val countStack = Stack<Int>()
        var currentString = StringBuilder()
        var currentCount = 0
        
        s.toCharArray().forEach{ currentChar ->
            if( currentChar.isDigit() ){
                 currentCount = 10 * currentCount + (currentChar - '0')
            }
            else if( currentChar == '[' ){
                countStack.push(currentCount)
                stringStack.push(currentString)
                
                currentCount = 0
                currentString = StringBuilder()
            }
            else if( currentChar == ']' ){
                var tmpBuilder = stringStack.pop()
                val repeatCount = countStack.pop()
                for(i in 0 until repeatCount){
                    tmpBuilder.append(currentString)
                }
                currentString = tmpBuilder
            }     
            else{
                currentString.append(currentChar)
            }
        }
        
        return currentString.toString()
        
    }
}