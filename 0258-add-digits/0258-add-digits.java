class Solution {
    public int addDigits(int num) {
    /*while(num>=10){
    int sum=0;
        while(num>0){
            int digit=num%10;
            sum+=digit;
            num=num/10;
        }
        num=sum;
    }
    return num;// but the time complexity is O(log^2n) and if we use mathematical approach the time complexity may be decrease
    */
    if(num==0)return 0;
    return 1+(num-1)%9;   //as  mentioned in question we stop addition if the last no is of single digit largest one digit no is 9 

    }
}