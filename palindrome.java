//Given an integer x, return true if x is a palindrome, and false otherwise.
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.

import java.util.*;
class Solution {
    public boolean isPalindrome(int x) {
        int original=x;
     int rev=0;
       while(x>0){
        int Ldigit=x%10;
        rev=rev*10+Ldigit;
        x=x/10;
       } 
      /* if(rev==x){
       return true;
       }
       else{
       return false;
       }*/
        return original==rev;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        Solution obj=new Solution();
        obj.isPalindrome(x);
    }
}

Output:-
  121
  true
