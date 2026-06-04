/*
The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,

F(0) = 0, F(1) = 1
F(n) = F(n - 1) + F(n - 2), for n > 1.
Given n, calculate F(n).

 

Example 1:

Input: n = 2
Output: 1
Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.

*/
class Solution {
    public int fib(int n) {
      
     /*     if(n<2){
            return n;
        }
        return fib(n-1)+fib(n-2);
     */
     if(n<2){
        return n;
     }
        int prev2 = 0; 
        int prev1 = 1; 
        int current = 0;
        for(int i=2;i<=n;i++){
            current=prev1+prev2;
            prev2=prev1;
            prev1=current;
        }
        return current;
    }
}




Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 

Example 1:

Input: x = 123
Output: 321/*

*/
  class Solution {
    public int reverse(int x) {
        int num=Math.abs(x);    //absolute value of orignial number
        int rev=0;
        while(num!=0){
            int digit=num%10;   //last digit
            if (rev > (Integer.MAX_VALUE -digit) / 10) {
                return 0;
            }
            rev=rev*10+digit;
            num=num/10;
        }
        return (x<0)?(-rev):rev;  
    }
}
