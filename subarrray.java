//Given an integer array nums, find the subarray with the largest sum, and return its sum.

//Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//Output: 6

class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum=nums[0];
        int currentSum=nums[0];
        for(int i=0;i<nums.length;i++){
            currentSum=  Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
     /*   int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int sum = 0;

            for (int j = i; j < n; j++) {

                sum += nums[j];

                // Print subarray
                for (int k = i; k <= j; k++) {
                    System.out.print(nums[k] + " ");
                }
                System.out.println();

                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        return maxSum;
        */
    }
}
