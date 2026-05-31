//You are given an integer array nums.
//You replace each element in nums with the sum of its digits.
//Return the minimum element in nums after all replacements.
Example 1:Input: nums = [10,12,13,14]
Output: 1

  class Solution {
    public int minElement(int[] nums) {
        int n=nums.length;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
                int sum = 0;
                int num = nums[i];

                while(num>0){
                    sum+=num%10;
                    num/=10;
                }
                min=Math.min(min,sum);
        }
        return min;
    }
}
