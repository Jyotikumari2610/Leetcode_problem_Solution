class Solution {
    public int maximumGap(int[] nums) {
        int n=nums.length;
        if(n<2) return 0;
        int min=nums[0];
        int max=nums[0];
        for(int num:nums){
            min=Math.min(min,num);
            max=Math.max(max,num);
        }
        if(min==max) return 0;
        int bucketSize=(max-min+n-2)/(n-1);
        int bucketCount=(max-min)/bucketSize+1;
        int minBuk[]=new int[bucketCount];
        int maxBuk[]=new int[bucketCount];
        boolean used[]=new boolean[bucketCount];
        for(int num:nums){
            int bcktIndx=(num-min)/bucketSize;
            if(!used[bcktIndx]){
                minBuk[bcktIndx]=num;
                maxBuk[bcktIndx]=num;
                used[bcktIndx]=true;
            }
            else{
                minBuk[bcktIndx]=Math.min(minBuk[bcktIndx], num);
                maxBuk[bcktIndx]=Math.max(maxBuk[bcktIndx], num);
            }
        }
        int maxGap=0;
        int previousMax=min;
        for(int buk=0;buk<bucketCount;buk++){
            if(!used[buk]) continue;
            int gap=minBuk[buk]-previousMax;
            maxGap=Math.max(maxGap,gap);
            previousMax=maxBuk[buk];
        }
        return maxGap;
    }
}