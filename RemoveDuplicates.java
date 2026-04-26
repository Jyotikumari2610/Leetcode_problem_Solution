//Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.
//Consider the number of unique elements in nums to be k​​​​​​​​​​​​​​. After removing duplicates, return the number of unique elements k.
//The first k elements of nums should contain the unique numbers in sorted order. The remaining elements beyond index k - 1 can be ignored

//Input: nums = [1,1,2]
//Output: 2, nums = [1,2,_]

import java.util.*;
class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        if(n==0){
            return 0;
        }
        int k=1;
        for(int i=1;i<n;i++){
            if(nums[i]!=nums[k-1]){
                nums[k]=nums[i];
                k++;
            }
        }
    return k;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int nums[]={1,1,2};
        Solution obj=new Solution();
        obj.removeElement(nums,val);
    }
}



//Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
//Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
//Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
//Return k.

//Input: nums = [0,1,2,2,3,0,4,2], val = 2
//Output: 5, nums = [0,1,4,0,3,_,_,_]

import java.util.*;
class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int k=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=val){
                nums[k]=nums[i];
                k++;
            }
        }
      return k;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int nums[]={3,2,2,3};
        int val=3;
        Solution obj=new Solution();
        obj.removeElement(nums,val);
    }
}

