class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        int min=nums[0];
        int max=nums[0];
        int minIndx=0;
        int maxIndx=0;
        for(int i=1;i<n;i++){
            if(nums[i]<min){
                min=nums[i];
                minIndx=i;
            }
            if(nums[i]>max){
                max=nums[i];
                maxIndx=i;
            }
        }
        if(minIndx>maxIndx){
            int temp=minIndx;
            minIndx=maxIndx;
            maxIndx=temp;
        }
        int front=maxIndx+1;  //Remove both from front
        int back=n-minIndx;  //Remove both from back
        //Remove min from front and max from back
        int both=(minIndx+1)+(n-maxIndx);

        return Math.min(front,Math.min(back,both));
    }
}