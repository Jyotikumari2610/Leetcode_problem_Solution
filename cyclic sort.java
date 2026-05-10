//Find All Numbers Disappeared in an Array

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        List<Integer>ans=new ArrayList<>();
        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index+1){
                ans.add(index+1);
            }
        }
     return ans;
    }
    static void swap(int nums[],int first,int scnd){
        int temp=nums[first];
        nums[first]=nums[scnd];
        nums[scnd]=temp;
    }
}
 class Solution {
    public int singleNumber(int[] nums) {
       /* int result=0;
        for(int i=0;i<nums.length;i++){
            result=result^nums[i];
        }
        return result;
        */
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j])
                    count++;
            }
        if(count ==1){
            return nums[i];
        }
      }
      return -1;
    }
    public static void main(String args[]){
        int nums[]={2,4,2};
        Solution obj=new Solution();
        obj.singleNumber(nums);
    }
}

// Find the Duplicate Number
class Solution {
    public int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }
            else{
                i++;
            }
        }
        int duplct=0;
        for(int indx=0;indx<nums.length;indx++){
            if(nums[indx]!=indx+1){
                duplct=nums[indx];
            }
        }
        return duplct;
    }
}

// Find All Duplicates in an Array

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }
            else{
                i++;
            }
        }
        List<Integer>ans=new ArrayList<>();
        for(int indx=0;indx<nums.length;indx++){
            if(nums[indx]!=indx+1){
                ans.add(nums[indx]);
            }
        }
        return ans;
    }
}
