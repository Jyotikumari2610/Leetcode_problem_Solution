class Solution {
    public boolean isGood(int[] nums) {
        int n=nums.length-1;
        int freq[]=new int[n+1];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>n){
                return false;
            }
            freq[nums[i]]++;
        }
        for(int i=1;i<n;i++){
            if(freq[i]!=1){
                return false;
            }
        }
        return freq[n]==2;
    }
}