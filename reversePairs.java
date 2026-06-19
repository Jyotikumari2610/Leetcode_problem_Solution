/*

Given an integer array nums, return the number of reverse pairs in the array.

A reverse pair is a pair (i, j) where:

0 <= i < j < nums.length and
nums[i] > 2 * nums[j].
 

Example 1:

Input: nums = [1,3,2,3,1]
Output: 2
Explanation: The reverse pairs are:
(1, 4) --> nums[1] = 3, nums[4] = 1, 3 > 2 * 1
(3, 4) --> nums[3] = 3, nums[4] = 1, 3 > 2 * 1
Example 2:

Input: nums = [2,4,3,5,1]
Output: 3
Explanation: The reverse pairs are:
(1, 4) --> nums[1] = 4, nums[4] = 1, 4 > 2 * 1
(2, 4) --> nums[2] = 3, nums[4] = 1, 3 > 2 * 1
(3, 4) --> nums[3] = 5, nums[4] = 1, 5 > 2 * 1
 
*/
class Solution {
    int count=0;
    public int reversePairs(int[] nums) {
      /* for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] > 2L * nums[j]) {
                    count++;
                }
             }
        }
        return count;
        */
        mergeSort(nums,0,nums.length-1);
        return count;
    }
    private void mergeSort(int nums[],int low,int high){
        if(low>=high){
            return;
        }
        int mid=low+(high-low)/2;
        mergeSort(nums,low,mid);
        mergeSort(nums,mid+1,high);

        countPairs(nums,low,mid,high);
        merge(nums,low,mid,high);
    }
    private void countPairs(int[] nums, int low, int mid, int high) {
        int right = mid + 1;

        for (int i = low; i <= mid; i++) {

            while (right <= high &&
                   nums[i] > 2L * nums[right]) {
                right++;
            }

            count += right - (mid + 1);
        }
    }
    private void merge(int [] nums,int low,int mid,int high){
        int temp[]=new int[high-low+1];
        int left=low;
        int right=mid+1;
        int k=0;
        while (left <= mid && right <= high) {
            if (nums[left] <= nums[right]) {
                temp[k++] = nums[left++];
            } else {
                temp[k++] = nums[right++];
            }
        }

        while (left <= mid) {
            temp[k++] = nums[left++];
        }

        while (right <= high) {
            temp[k++] = nums[right++];
        }

        for (int i = 0; i < temp.length; i++) {
            nums[low + i] = temp[i];
        }
    }
  /*  static void reverse(int nums[]){
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;

            left++;
            right--;
        }
    }*/
}
