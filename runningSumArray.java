//Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
//Return the running sum of nums.
Input: nums = [1,2,3,4]
Output: [1,3,6,10]

class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
        int runningSum[]=new int[n];
        runningSum[0]=nums[0];
        for(int i=1;i<n;i++){
            runningSum[i]=runningSum[i-1]+nums[i];
        }
        return runningSum;
    }
    public static void main(String args[]){
        int nums[]={1,2,3,4};
        Solution obj=new Solution();
        obj.runningSum(nums);
    }
}
