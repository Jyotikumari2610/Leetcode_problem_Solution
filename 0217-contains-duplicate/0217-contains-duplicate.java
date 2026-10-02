class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);                        //sort the element of array
       /* for(int i=0;i<nums.length;i++){          //loop to continue from element from index 0 to length of array
            for(int j=i+1;j<nums.length;j++){   //checks every element after i and loop will continue to length of array
            if(nums[i]==nums[j]){
                return true;
            }
            else{
                break;    //if element i=j then loop breaks not coninue to next because array is sorted
           }
        }
        }//time complexity here is O(n^2) */
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        //time complexity of this code will be O(n log n)

        //agr time complexity aur kmm krna h that is O(n) to yha p hmlog hashset use kr sakte h bcoz as we know hashset alway contains unique elements 
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
}