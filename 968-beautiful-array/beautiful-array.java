class Solution {
    public int[] beautifulArray(int n) {
        ArrayList<Integer>res = new ArrayList<>();
        res.add(1);
        while(res.size()<n){
            ArrayList<Integer>temp = new ArrayList<>();
            for(int i : res){
                if(i*2-1<=n){
                    temp.add(i*2-1);
                }
            }
            for(int i : res){
                if(i*2<=n){
                    temp.add(i*2);
                }
            }
            res=temp;
        }
        int ans[]=new int [n];
        for(int i=0;i<res.size();i++){
            ans[i]=res.get(i);
        }
        return ans;
    }
}
//one of the worst qs.
 /*
for each 
odd el = 2*el-1
even el = 2*el
 */