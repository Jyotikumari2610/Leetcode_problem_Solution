//Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

//Input: nums = [1,2,3,1], k = 3
//Output: true

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
      for(int i = 0; i < nums.length; i++){
        for(int j = i + 1; j <= i + k && j < nums.length; j++){  //For each element, check only the next k elements for duplicates
            if(nums[i] == nums[j]){
                return true;
            }
        }
    }
    return false;
}
    
}
