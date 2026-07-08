class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        for(int i=0;i<n;i++){
            int req=target-numbers[i];
            int indx=binarySearch(numbers,req,i+1,n-1);
            if(indx!=-1){
                return new int[]{i+1,indx+1};
            }
        }
       return new int[]{};
    }
    public int binarySearch(int[] numbers, int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(numbers[mid]==target){
                return mid;
            }
            else if(numbers[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
       return -1;
    }
}