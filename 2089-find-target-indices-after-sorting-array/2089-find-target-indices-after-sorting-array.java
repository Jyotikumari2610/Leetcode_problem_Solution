class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        ArrayList<Integer>list=new ArrayList<>();
        int strt=0;
        int end=nums.length-1;
        while(strt<=end){
            int mid=strt+(end-strt)/2;
            if(nums[mid]==target){
                list.add(mid);
                int i=mid-1;
                while(i>=0 &&nums[i]==target){
                    list.add(i);
                    i--;
                }
                int j=mid+1;
                while(j<nums.length && nums[j]==target){
                    list.add(j);
                    j++;
                }
                Collections.sort(list);
                return list;
            }
            else if(nums[mid]<target){
                strt=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return list;
    }
}