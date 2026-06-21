/*You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.

Return the single element that appears only once.

Your solution must run in O(log n) time and O(1) space.

 

Example 1:

Input: nums = [1,1,2,3,3,4,4,8,8]
Output: 2
Example 2:

Input: nums = [3,3,7,7,10,11,11]
Output: 10*/

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        if(n==1)  return nums[0];
        if(nums[0]!=nums[1])  return nums[0];//we use this statement as if the 1st element is the single element then 1st will return
        if(nums[n-1]!=nums[n-2])  return nums[n-1];//or if the last element is the single element then last will return
        int start=1;
        int end=n-2;//bcoz we had alraedy checked for 1st and last element
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1]){//if mid element is te single element the return mid
                return nums[mid];
            }
            //eleimaination part
            if(mid%2==1 && nums[mid-1]==nums[mid] || mid%2==0 && nums[mid]==nums[mid+1]){ //if i'm  at left half and the elemet is right half
                start=mid+1;    //eliminate the left half
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}
