import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
      /* for(int i=0;i<nums.length;i++){
          // for(int j=i+1;j<nums.length;j++){
                if(nums[i+1]==target-nums[i]){
                    return new int[]{i,i+1};
                }
          // }
        }
        return new int[]{-1,-1};
        */
        HashMap<Integer,Integer>map1=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int comp=target-nums[i];
            if(map1.containsKey(comp)){
                return new int[]{map1.get(comp),i};
            }
            map1.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int target =sc.nextInt();
        Solution obj=new Solution();
        obj.twoSum(nums,target);
    }
}