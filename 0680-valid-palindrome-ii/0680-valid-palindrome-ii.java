class Solution {
    public boolean validPalindrome(String s) {
        if(s.length()<=1){
            return true;
        }
        int strt=0;
        int end=s.length()-1;
        while(strt<=end){
            if(s.charAt(strt)!=s.charAt(end)){
                return isPalindrome(s,strt+1,end) || isPalindrome(s,strt,end-1);
            }
            strt++;
            end--;
        }
        return true;
    }
    public boolean isPalindrome(String s,int strt,int end){
        while(strt<=end){
            if(s.charAt(strt)!=s.charAt(end)){
                return false;
            }
            strt++;
            end--;
        }
        return true;
    }
}