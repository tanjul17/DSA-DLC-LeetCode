class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]==bs(nums1[i],nums2))return nums1[i];
        }
        return -1;
    }
    public int bs(int k, int arr[]){
        int i=0,j=arr.length-1;
        while(i<=j){
            int m = (i+j)/2;
            if(arr[m]==k)return k;
            else if(arr[m]<k)i = m+1;
            else  j= m-1;
        }
        return -1;
    }
}