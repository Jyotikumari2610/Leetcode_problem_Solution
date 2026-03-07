//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
Input: nums = [1,2,3,1]
Output: true

  class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);                        //sort the element of arra
        for(int i=0;i<nums.length;i++){          //loop to continue from element from index 0 to length of array
            for(int j=i+1;j<nums.length;j++){   //checks every element after i and loop will continue to length of array
            if(nums[i]==nums[j]){
                return true;
            }
            else{
                break;    //if element i=j then loop breaks not coninue to next because array is sorted
           }
        }
        }
        return false;
    }
}
