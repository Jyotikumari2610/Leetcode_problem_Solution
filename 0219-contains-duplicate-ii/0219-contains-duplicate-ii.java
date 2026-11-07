class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
      /*  Arrays.sort(nums);                        //sort the element of array
        for(int i=0;i<nums.length;i++){          //loop to continue from element from index 0 to length of array
            for(int j=i+1;j<nums.length;j++){   //checks every element after i and loop will continue to length of array
            if(nums[i]==nums[j]){
                return true;
            }
            else{
                break;    //if element i=j then loop breaks not coninue to next because array is sorted
           }
        }
        }
        return false;*/
    /*for(int i = 0; i < nums.length; i++){
        for(int j = i + 1; j <= i + k && j < nums.length; j++){
            if(nums[i] == nums[j]){
                return true;
            }
        }
    }
    return false;*/
    HashSet<Integer>set=new HashSet<>();
    for(int i=0;i<nums.length;i++){
        if(set.contains(nums[i])){
            return true;
        }
        set.add(nums[i]);
        if(set.size()>k){
            set.remove(nums[i-k]);
        }
    }
    return false;
}
    
}