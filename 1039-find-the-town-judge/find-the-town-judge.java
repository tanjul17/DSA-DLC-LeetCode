class Solution {
    public int findJudge(int n, int[][] trust) {
        int r [] = new int[n+1];//for counting indegree and outdegree
        if(n==1)return 1;
        for(int t [] :trust){
            r[t[0]]--;//outdegree
            r[t[1]]++;//indegree
        }
        for(int i=0;i<=n;i++){
            if(r[i]==n-1)return i;//indegree==n-1 mean that element is leader
        }
        return -1;
    }
}