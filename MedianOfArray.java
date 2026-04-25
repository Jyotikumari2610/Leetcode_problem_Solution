//Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
//The overall run time complexity should be O(log (m+n)).

import java.util.*;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int arr[]=new int[m+n];
        for(int i=0;i<m;i++){
            arr[i]=nums1[i];
        }
        for(int i=0;i<n;i++){
            arr[m+i]=nums2[i];
        }
        Arrays.sort(arr);
        int count=arr.length;
        if(count%2==0){
            return (arr[count/2 - 1] + arr[count/2]) / 2.0;
        }
        else{
            return arr[count/2];
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int nums1[]=new int[m];
        int nums2[]=new int[n];
        int arr[]=new int[m+n];
        Solution obj=new Solution();
        obj.findMedianSortedArrays(nums1,nums2);
    }
}
