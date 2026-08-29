class Solution {
    public List<String> summaryRanges(int[] nums) {
       List<String> result =new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int strt = nums[i];
            while(i+1<n && nums[i+1]-nums[i]==1){
                i++;
            }
            if(strt!=nums[i]){
                result.add(strt +"->"+ nums[i]);
            }
            else {
                result.add(String.valueOf(strt));
            }
        }
        return result; 
    }
}