class Solution {
    public int lengthOfLIS(int[] nums) {
        HashSet<Integer>set = new HashSet<>();
        for(int i:nums)set.add(i);
        int num1[]=new int[set.size()];
        int i=0;
        for(int j:set){
            num1[i]=j;
            i++;
        }
        Arrays.sort(num1);
        return lcs(nums,num1);
    }
    public int lcs(int n1[],int []n2){
        int n=n1.length,m=n2.length;
        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<n+1;i++)dp[i][0]=0;
        for(int i=0;i<m+1;i++)dp[0][i]=0;
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(n1[i-1]==n2[j-1]){
                    dp[i][j]=dp[i-1][j-1]+1;
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[n][m];
    }

}