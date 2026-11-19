class Solution {
    public int minimizeSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int A=nums[n-1]-nums[2];
        int B=nums[n-2]-nums[1];
        int C=nums[n-3]-nums[0];
        int ans=Math.min(A,Math.min(B,C));
        return ans;
    }
}