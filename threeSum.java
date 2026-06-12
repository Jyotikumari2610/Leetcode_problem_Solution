/*
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

 

Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation: 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.
Example 2:

Input: nums = [0,1,1]
Output: []
Explanation: The only possible triplet does not sum up to 0.
Example 3:

Input: nums = [0,0,0]
Output: [[0,0,0]]
Explanation: The only possible triplet sums up to 0.*/

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
     /*   Set<List<Integer>>lst=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            HashSet<Integer>set1=new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                int third=-(nums[i]+nums[j]);
                if(set1.contains(third)){
                    int temp[]={nums[i],nums[j],third};
                    Arrays.sort(temp);
                    lst.add(Arrays.asList(temp[0], temp[1], temp[2]));
                }
                set1.add(nums[j]);
            }
        }
        return new ArrayList<>(lst);
        */
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;           // Skip duplicate first elements
            }
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum < 0) {
                    j++;
                }
                else if (sum > 0) {
                    k--;
                }
                else {
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
        
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;      // Skip duplicate second elements
                    }
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;        // Skip duplicate third elements
                    }
                }
            }
        }
        return ans;
    }
}
