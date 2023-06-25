class Solution {
    int mod = (int)Math.pow(10,9)+7;
    int cache[][];
    public int countRoutes(int[] locations, int start, int finish, int fuel) {
        cache = new int [locations.length][fuel+1];
        for(int [] row:cache){
            Arrays.fill(row,-1);
        }
        return dfs(locations,start,finish,fuel);
    }
    public int dfs(int[]locations,int cur,int goal,int fuel){
        if(fuel<0){
            return 0;
        }
        if(cache[cur][fuel]!=-1){
            return cache[cur][fuel];
        }
        int result = 0;
        if(cur==goal){
            result++;
        }
        for(int i = 0;i<locations.length;i++){
            if(i==cur)continue;
            int cost=Math.abs(locations[cur]-locations[i]);
            int nextTrip = dfs(locations,i,goal,fuel-cost);
            result +=nextTrip;
            result %= mod;
        }
        cache[cur][fuel]=result;
        return result;
    }
}