class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        int sz1=0;
        int sz2=0;
        arr1[sz1++]=nums[0];
        arr2[sz2++]=nums[1];
        for(int i=2;i<n;i++){
            if(arr1[sz1-1] > arr2[sz2-1]){
                arr1[sz1++]=nums[i];
            }
            else{
                arr2[sz2++]=nums[i];
            }
        }
        int result[]=new int[n];
        int indx=0;
        for(int i=0;i<sz1;i++){
            result[indx++]=arr1[i];
        }
        for(int i=0;i<sz2;i++){
            result[indx++]=arr2[i];
        }
        return result;
    }
}