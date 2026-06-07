//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//Note that you must do this in-place without making a copy of the array.
//Input: nums = [0,1,0,3,12]
//Output: [1,3,12,0,0]

class Solution {
    public void moveZeroes(int[] nums) {
        int index=0;   //intialise the index variable with zero value
        //start a loop from i=0 to length of array
        for(int  i=0;i<nums.length;i++){
            if(nums[i]!=0){    //if elements of array is not equal to zero then we intialise index value is equal to element of array
             nums[index]=nums[i];
             index++;     //store all non zero elements first
            }
        }
        while(index<nums.length){    // check that index value must be less than the length of array 
            nums[index]=0;           //initialise index value as zero and increment the place
            index++;                 //fill remaing space with zero
        }
        System.out.println(Arrays.toString(nums));
        int nonZero = 0;

        for (int current = 0; current < nums.length; current++) {
            if (nums[current] != 0) {
                int temp = nums[nonZero];
                nums[nonZero] = nums[current];
                nums[current] = temp;
                nonZero++;
            }
        }
    }
} 
