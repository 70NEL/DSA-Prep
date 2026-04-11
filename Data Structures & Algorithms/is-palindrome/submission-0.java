class Solution {
     public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        char[] temp = s.toCharArray();
        int l = 0;
        int r = temp.length - 1;

        while(l<r){
            while(l < r && !Character.isLetterOrDigit(temp[l])){
                l++;
            }
            while(l < r && !Character.isLetterOrDigit(temp[r])){
                r--;
            }
            if(temp[l] != temp[r]) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}