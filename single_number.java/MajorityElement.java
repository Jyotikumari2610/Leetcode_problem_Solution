//Given an array nums of size n, return the majority element.
//The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
Input: nums = [3,2,3]
Output: 3

  class Solution {
    public int majorityElement(int[] nums) {
       /* for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j])
                    count++;
            }
            if(count>nums.length/2){
                return nums[i];
            }
    }*/
   /* HashMap<Integer,Integer>map=new HashMap<>();
    for(int i=0;i<nums.length;i++){
       map.put(nums[i],map.getOrDefault(nums[i],0)+1);//copy the array element to hashmap
    }
    for(Map.Entry<Integer,Integer>e:map.entrySet()){
        if(e.getValue()>nums.length/2){
            return e.getKey();
        }
    }//this step is taking more space as we had initailse the map and copy all the elements of the array to the map so its taking space
    //space complexity is O(n)
    //and time complexity is O(n log n)
    */
    //by the MOORE'S VOTING ALGORITHM we can solve this problem as optimal unique solution
    int count=0;
    int element=0;
    for(int i=0;i<nums.length;i++){
        if(count ==0){
            count=1;
            element=nums[i];
        }
        else if(nums[i]==element){
            count++;
        }
        else{
            count--;
        }
    }
    int count1=0;
    for(int i=0;i<nums.length;i++){
        if(nums[i]==element){
            count1++;
        }
    }
    if(count1>nums.length/2){
        return element;
    }
    return -1;
  }
  public static void main(String args[]){
        int nums[]={2,4,2};
        Solution obj=new Solution();
        obj.majorityElement(nums);
  }
}
