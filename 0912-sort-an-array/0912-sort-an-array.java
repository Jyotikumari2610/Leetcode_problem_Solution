class Solution {
    public int[] sortArray(int[] nums) {
       /* quickSort(nums,0,nums.length-1);
        return nums;
        */
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
    /*void quickSort(int nums[],int low,int high){
        if(low<=high){
            int pivot=partition(nums,low,high);
            quickSort(nums,low,pivot-1);
            quickSort(nums,pivot+1,high);
        }
    }
    int partition(int nums[],int low,int high){
        int pivot=nums[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(nums[j]<=pivot){
                i++;
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
        int temp=nums[i+1];
        nums[i+1]=nums[high];
        nums[high]=temp;

     return i+1;*/
     void mergeSort(int[] nums,int strt,int end) {
       if (strt<end) {
            int middle=(end-strt)/2 + strt;
            mergeSort(nums, strt,middle);
            mergeSort(nums, middle + 1,end);
            merge(nums, strt, middle,end);
        }
    }
    void merge(int nums[],int strt,int mid,int end){
        int n1=mid-strt+1;
        int n2=end-mid;
        int arr1[]=new int[n1];
        int arr2[]=new int[n2];
        for(int i=0;i<n1;i++){
            arr1[i]=nums[strt+i];
        }
        for(int i=0;i<n2;i++){
            arr2[i]=nums[mid+1+i];
        }
        int i=0,j=0,k=strt;
        while(i<n1 && j<n2){
            if(arr1[i]<=arr2[j]){
                nums[k]=arr1[i];
                i++;
            }else{
                nums[k]=arr2[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            nums[k]=arr1[i];
            i++;
            k++;
        }
        while(i<n2){
            nums[k]=arr2[j];
            j++;
            k++;
        }

    }
}