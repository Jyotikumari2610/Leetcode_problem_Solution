//You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
//Increment the large integer by one and return the resulting array of digits.
Input: digits = [1,2,3]
Output: [1,2,4]

class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int[] newArr = new int[digits.length + 1];
        newArr[0] = 1;
        return newArr;
       // return new int[digits.length+1];
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int digits[]={4,7,8,4};
        Solution obj=new Solution();
        obj.plusOne(digits);
    }
}
