//Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
//If target is not found in the array, return [-1, -1].
//You must write an algorithm with O(log n) runtime complexity.
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]


import java.util.*;
class Solution {
    public int[] searchRange(int[] nums, int target) {
    /* int first=-1,last=-1;
       for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                if(first==-1){
                    first=i;
                }
                last=i;
            }
        }*/
    int first=firstOccurrence(nums,target);
    if(first==-1){ 
        return new int[]{-1,-1};
    }
    int last=lastOccurrence(nums, target);
    return new int[]{first,last};
    }
     int firstOccurrence(int nums[],int target){
        int first=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                first=mid;
                end=mid-1;
            }
           else if(nums[mid]<target){
            start=mid+1;
           }
           else{
              end=mid-1;
           }
        }
        return first;
    }
     int lastOccurrence(int nums[],int target){
        int last=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                last=mid;
                start=mid+1;
            }
           else if(nums[mid]<target){
            start=mid+1;
           }
           else{
              end=mid-1;
           }
        }
        return last;
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        Solution obj=new Solution();
        obj.searchRange(nums,target);
    }
}
