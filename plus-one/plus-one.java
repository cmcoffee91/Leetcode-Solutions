class Solution {
    public int[] plusOne(int[] digits) {
        
        int carry = 1;
        int remainder = 0;
        for(int i = digits.length - 1;i >= 0;i--){
            int num = digits[i];
            num += carry + remainder;
            carry = num/10;
            if(num > 9) num = num % 10;
            digits[i] = num;
        }
        
        if(carry > 0){
            int[] carryArray = new int[digits.length+1];
            carryArray[0] = carry;
            int leftPos = 1;
            for(int i = 0; i < digits.length;i++){
                carryArray[leftPos] = digits[i];
                leftPos++;
            }
            return carryArray;
        }
        
        return digits;
        
        
    }
}