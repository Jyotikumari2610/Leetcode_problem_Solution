class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int strt=0;
        int end=arr.length-k;
        ArrayList<Integer>ans=new ArrayList<>();
        while(strt<end){
            int mid=strt+(end-strt)/2;
            if(x-arr[mid]>arr[mid+k]-x){
                strt=mid+1;
            }
            else{
                end=mid;
            }
        }
        for(int i=strt;i<strt+k;i++){
            ans.add(arr[i]);
        }
        return ans;
    }
}