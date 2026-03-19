class Solution {
    public int missingNumber(int[] nums) {
        int i=0;

        while(i<nums.length){
            int correct=nums[i];

            if(nums[i]<nums.length && nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }

        }
            //find missing number
            for(int indx=0;indx<nums.length;indx++){
                if(nums[indx]!=indx){
                    return indx;
                }
            }
            return nums.length;
        }
         void swap(int nums[],int first,int scnd){
            int temp=nums[first];
            nums[first]=nums[scnd];
            nums[scnd]=temp;
        }
}
