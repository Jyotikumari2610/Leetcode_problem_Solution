class Solution {
    public int splitArray(int[] nums, int k) {
       int start=0;
       int end=0;
       for(int num:nums){
        start=Math.max(start,num);
        end+=num;
       } 
       int ans=end;
       while(start<=end){
        int mid=start+(end-start)/2;
        if(canSplit(nums,k,mid)){
            ans=mid;
            end=mid-1;
        }
        else{
            start=mid+1;
        }
       }
       return ans;
    }
    public boolean canSplit(int[] nums,int k,int maxSum){
        int subArrays=1;
        int sum=0;
        for(int num:nums){
            if(sum+num<=maxSum){
                sum+=num;
            }
            else{
                subArrays++;
                sum=num;
            }
        }
     return subArrays<=k;
    }
}