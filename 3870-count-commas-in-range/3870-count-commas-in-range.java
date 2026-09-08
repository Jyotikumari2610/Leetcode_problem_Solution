class Solution {
    public int countCommas(int n) {
        if(n<=999)return 0;
        long start=1000;
        long commas=1;
        long ans=0;
        while(start<=n){
            long nxtbundry=start*1000;
            long end=Math.min(n,nxtbundry-1);
            long noofNos=end-start+1;
            long contribution=noofNos*commas;
            ans+=contribution;
            start=nxtbundry;
            commas++;
        }
        return (int)ans;
    }
}