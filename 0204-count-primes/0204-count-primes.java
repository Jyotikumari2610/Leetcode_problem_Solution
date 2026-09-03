class Solution {
    public int countPrimes(int n) {
        if(n<=1)return 0;
        int count=0;
       /* for(int i=2;i<=n-1;i++){
            boolean prime=true;
            for(int j=2;j*j<=i;j++){
                if(i%j==0){
                    prime=false;
                    break;
                }
            }
            if(prime) count++;
        }*/
        boolean isPrime[]=new boolean[n];
        for(int i=2;i<n;i++){
            if(isPrime[i]==false){
                count++;
                for(int j=2;i*j<n;j++){
                    isPrime[i*j]=true;
                }
            }
        }
        return count;
    }
}