class Solution {
    public int[][] merge(int[][] inter) {
        List<int[]>res = new ArrayList<>();
        if(inter.length==0||inter==null)return res.toArray(new int [0][]);
        Arrays.sort(inter, (a, b) -> a[0] - b[0]);
        int s = inter[0][0];
        int e = inter[0][1];
        for(int in[]:inter){
            if(in[0]<=e){
                e = Math.max(e,in[1]);
            }else{
                res.add(new int []{s,e});
                s = in[0];
                e = in[1];
            }
        }
        res.add(new int []{s,e});
        return res.toArray(new int [0][]);
    }
}
/*
basically ham log given inter in traverse krte hai and dekhte hai 
if(in[0]<=e)-->means ham interwal ko merge kr skte hai 
so we have to take the max from the prev e and prev e and make it as curr e
else just add those interwal to the res 2d array 
 */