//Given an array nums of integers, return how many of them contain an even number of digits.
Input: nums = [12,345,2,6,7896]
Output: 2

import java.util.*;
class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
         int num = Math.abs(nums[i]);
         int digits=0; 
            while(num>0){
                //int digit=num%10;
                digits++;
                num=num/10;
            }
            if(digits%2==0){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        Solution obj=new Solution();
        obj.findNumbers(nums);
    }
}

Output:-
[12,345,2,6,7896]
2
