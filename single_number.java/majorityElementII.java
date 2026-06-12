/*Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

 

Example 1:

Input: nums = [3,2,3]
Output: [3]
Example 2:

Input: nums = [1]
Output: [1]
Example 3:

Input: nums = [1,2]
Output: [1,2]
*/

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cnt1=0, cnt2=0;
        int element1=Integer.MIN_VALUE;
        int element2=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(cnt1==0 && element2!=nums[i]){
                cnt1=1;
                element1=nums[i];
            }
            else if(cnt2==0 && element1!=nums[i]){   
            cnt2=1;
            element2=nums[i];
            }
            else if(nums[i]==element1)  cnt1++;
            else if(nums[i]==element2)  cnt2++;
            else{
                cnt1--;
                cnt2--;
            }
        }
        cnt1=0;
        cnt2=0;
        for(int num:nums){
            if(num==element1) cnt1++;
            if(num==element2) cnt2++;
        }
        ArrayList<Integer>lst=new ArrayList<>();

        int mini = nums.length / 3 + 1;

        if (cnt1 >= mini) lst.add(element1);
        if (cnt2 >= mini) lst.add(element2);

        Collections.sort(lst);

        return lst;
        
    }
}
