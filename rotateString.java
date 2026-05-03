//Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.
//A shift on s consists of moving the leftmost character of s to the rightmost position.
//For example, if s = "abcde", then it will be "bcdea" after one shift.


//Input: s = "abcde", goal = "cdeab"
//Output: true

class Solution {
    public boolean rotateString(String s, String goal) {
       if(s.length()!=goal.length()){
        return false;
       } 
       int n=s.length();
       for(int i=0;i<n;i++){
            if(s.equals(goal)){   
                return true;
            }
         char fst=s.charAt(0);
         String rst=s.substring(1);
          s=rst+fst;
       }
     return false;
  }
}
