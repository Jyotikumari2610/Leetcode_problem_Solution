//Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
//Specifically, ans is the concatenation of two nums arrays.
//Return the array ans.
Input: nums = [1,2,1]
Output: [1,2,1,1,2,1]

import java.util.*;
class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
       int ans[]=new int[n+n];    //taken new arr as double the length of previous array
       for(int i=0;i<n;i++){     //loop continuing to n
           ans[i]=nums[i];       //firstly the element of previous array is equal to the element of new arr
            ans[i+n]=nums[i];    //and then after both elements have equal no of element then nums k elemnt ko ans array k aage wale element m move krwayenge
       } 
       return ans;              //and then return the new array 
    }
    public static void main(String args[]){
        int nums[]={1,2,1};
        Solution obj=new Solution();
        obj.getConcatenation(nums);
    }
}
