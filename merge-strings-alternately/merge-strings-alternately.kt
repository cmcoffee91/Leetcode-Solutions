class Solution {
    fun mergeAlternately(word1: String, word2: String): String {
        val wordOneArray = word1.toCharArray()
        val wordTwoArray = word2.toCharArray()
        
        var onePos = 0 
        var twoPos = 0 
        
        val stringBuilder = StringBuilder()
        
        while(onePos < wordOneArray.size && twoPos < wordTwoArray.size){
            stringBuilder.append( wordOneArray[onePos++] )
            stringBuilder.append( wordTwoArray[twoPos++] )
        }
        
        while(onePos < wordOneArray.size) stringBuilder.append( wordOneArray[onePos++] )
        while(twoPos < wordTwoArray.size) stringBuilder.append( wordTwoArray[twoPos++] )
        
        return stringBuilder.toString()
        
    }
}