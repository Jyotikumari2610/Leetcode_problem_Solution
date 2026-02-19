//You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.
Input: accounts = [[1,2,3],[3,2,1]]
Output: 6

import java.util.*;
class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxwealth=0;
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            for(int j=0;j<accounts[i].length;j++){
               sum +=accounts[i][j];
            }
            if(sum>maxwealth){
                maxwealth=sum;
            }
        }
        return maxwealth;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int accounts[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                accounts[i][j]=sc.nextInt();
            }
        }
        Solution obj=new Solution();
        obj.maximumWealth(accounts);
    }
}

Output:-
[[1,2,3],[3,2,1]]
6
