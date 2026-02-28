//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//You must implement a solution with a linear runtime complexity and use only constant extra space.
Input: nums = [2,2,1]
Output: 1

  class Solution {
    public int singleNumber(int[] nums) {
       /* int result=0;
        for(int i=0;i<nums.length;i++){
            result=result^nums[i];
        }
        return result;
        */
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j])
                    count++;
            }
        if(count ==1){
            return nums[i];
        }
      }
      return -1;
    }
    public static void main(String args[]){
        int nums[]={2,4,2};
        Solution obj=new Solution();
        obj.singleNumber(nums);
    }
}
