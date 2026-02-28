//Given an array nums of size n, return the majority element.
//The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
Input: nums = [3,2,3]
Output: 3

  class Solution {
    public int majorityElement(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j])
                    count++;
            }
            if(count>nums.length/2){
                return nums[i];
            }
    }
    return -1;
  }
  public static void main(String args[]){
        int nums[]={2,4,2};
        Solution obj=new Solution();
        obj.majorityElement(nums);
  }
}
 
