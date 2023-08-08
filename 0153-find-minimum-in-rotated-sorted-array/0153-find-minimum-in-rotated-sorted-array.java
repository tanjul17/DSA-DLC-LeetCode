class Solution {
public int findMin(int[] n){
    if(n[0] <= n[n.length-1]){
        return n[0];
    }
    int l = 0,r = n.length-1;
    while(l <= r){
        int m= l +(r - l)/2;
        if(m-1 >= 0 && n[m] < n[m-1] ){
            return n[m];
        }else if(n[m] > n[r]){
            l = m+1;
        }else{
            r = m-1;  
        }
    }
    return n[l];
    // Arrays.sort(nums);
    // return nums[0];
    }   
}