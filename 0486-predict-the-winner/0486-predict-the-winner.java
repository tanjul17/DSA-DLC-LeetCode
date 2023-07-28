class Solution {
    public boolean PredictTheWinner(int[] nums) {
        int two = 0;
        int n = nums.length;
        for(int i = 0;i<n;i++){
            two+=nums[i];
        }
        int one = ok(nums,0,n-1,0);
        two-=one;
        return one>=two;
    }
    public int ok(int [] nums,int i,int j,int chance){
        if(i>j) return 0;
        if(chance==0) return Math.max(nums[i]+ok(nums,i+1,j,1),nums[j]+ok(nums,i,j-1,1));
        else return Math.min(ok(nums,i+1,j,0),ok(nums,i,j-1,0));
    }
}