class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int sum=0;
        int minLength=Integer.MAX_VALUE;
        for(int rght=0;rght<nums.length;rght++){
            sum+=nums[rght];
            while(sum>=target){
                minLength=Math.min(minLength,rght-left+1);
                sum-=nums[left];
                left++;
            }
        }
        return minLength==Integer.MAX_VALUE ? 0:minLength;
    }
}