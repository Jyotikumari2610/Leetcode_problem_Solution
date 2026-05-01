//You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
//Merge nums1 and nums2 into a single array sorted in non-decreasing order.
//The final sorted array should not be returned by the function, but instead be stored inside the array nums1
//To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.


//Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//Output: [1,2,2,3,5,6]

import java.util.*;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int arr[]=new int[m+n];
        //copy nums1 element
        for(int i=0;i<m;i++){
            arr[i]=nums1[i];
        }
        //copy nums2 element
        for(int i=0;i<n;i++){
            arr[m+i]=nums2[i];
        }
        Arrays.sort(arr);//sort the array
        //copy back to nums1 element
         for(int i=0;i<m+n;i++){
            nums1[i]=arr[i];
        }
       // System.out.println(Arrays.toString(nums1));
    }
      public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int nums1[]=new int[k];
        for(int i=0;i<k;i++){
            nums1[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int l=sc.nextInt();
        int nums2[]=new int[l];
        for(int i=0;i<l;i++){
            nums2[i]=sc.nextInt();
        }
        int n=sc.nextInt();
        Solution obj=new Solution();
        obj.merge(nums1,m,nums2,n);
        System.out.println(Arrays.toString(nums1));
    }

}
