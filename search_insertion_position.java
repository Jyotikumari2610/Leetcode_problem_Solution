//Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
//You must write an algorithm with O(log n) runtime complexity.
Input: nums = [1,3,5,6], target = 5
Output: 2

import java.util.*;
class Solution {
    public int searchInsert(int[] nums, int target) {
     /*   for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
            else if(nums[i] >= target)
             return i;       //insert as middle element of the array 
        }
        return nums.length;   //if target element is not found the indert it as last elemet of array
        //we are not using because interviewers must not be happy with this because its time complexity is O(n) but in description of
        questions its mentioned that the time complexity must be O(log n).
        */
        //we use binary search to reduce time complexity
        int start =0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return start;
        

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
        obj.searchInsert(nums,target);
    }
}
