class Solution {
    public int totalNumbers(int[] digits) {
        int freq[]=new int[10];
        //Count how many times each digit appears
        for(int digit:digits){
            freq[digit]++;
        }
        int count=0;
        //loop for 3 digits no onl
        for(int i=100;i<=999;i++){
            if(i%2!=0){
                continue;
            }
            int a=i/100;
            int b=(i/10)%10;
            int c=i%10;
            freq[a]--;
            freq[b]--;
            freq[c]--;
            if(freq[a]>=0 && freq[b]>=0 && freq[c]>=0){
                count++;
            }
            freq[a]++;
            freq[b]++;
            freq[c]++;
        }
        return count;
    }
}