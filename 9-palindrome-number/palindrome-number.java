class Solution {
    public boolean isPalindrome(int x) {
        // check first number is nagative 
        if(x < 0){
            return false;
        }
        
        int copyNum = x;
        int reverse = 0;
        while(x != 0 ){
            int remainder = x % 10;
            reverse = (reverse * 10) + remainder;
            x = x/10;
        }

        // check number is palindrome
        if(reverse == copyNum){
            return true;
        }

        return false;
    }
}