//A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

//Given a string s, return true if it is a palindrome, or false otherwise.
/*
 

Example 1:
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome
  */
import java.util.*;
class Solution {
    public boolean isPalindrome(String s) {
     /*
        if (s.length() <= 1) {
            return true;
        }
        String original=s;
        String rev="";
        for(int i=s.length()-1;i<=0;i--){
            rev=rev +s.charAt(i);
        }*/
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                str.append(Character.toLowerCase(ch));
            }
        }
        String original=str.toString();
        String rev=str.reverse().toString();
        return rev.equals(original);

    }
}


/*
Given an integer x, return true if x is a palindrome, and false otherwise.

 

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
*/

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
