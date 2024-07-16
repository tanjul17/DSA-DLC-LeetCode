class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int sum=0;
        for(int i=0;i<customers.length;i++){
            if(grumpy[i]==0)sum+=customers[i];
        }
        int mx = maxSumOfK(customers,grumpy,minutes);
        return mx+sum;
    }
    public int maxSumOfK(int c[],int g[],int m){
        int i=0,j=0,sum=0,mx = Integer.MIN_VALUE;
        while(j<c.length){
            if(g[j]==1)sum+=c[j];
            if(j-i+1<m)j++;
            else if(j-i+1==m){
                mx = Math.max(mx,sum);
                if(g[i]==1)
                sum-=c[i];
                i++;
                j++;
            }
        }
        return mx;
    }
}