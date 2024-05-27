class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int x = -1;
        for(int i = 0; i <= n; i++){
            int low = 0, high = n-1;
            x = i;
            int ans = -1;
            while(low <= high){
                int mid = low + (high - low) / 2;
                if(nums[mid] < x){
                    low = mid+1;
                }else{
                    ans = mid;
                    high = mid-1;
                }
            }
            if(x == n - ans)
                return x;
        }
        return -1;
    }
}