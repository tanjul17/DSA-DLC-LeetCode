class Solution {
    public List<List<Integer>> combinationSum(int[] c, int target) {
        List<List<Integer>>res = new ArrayList<>();
        ArrayList<Integer>tempList = new ArrayList<>();
        combination(res,tempList,0,c,target);
        return res;
    }
    public void combination(List<List<Integer>>res,ArrayList<Integer>tempList,int start,int [] c,int rem){
        if(rem<0) return;
        else if(rem==0){
            res.add(new ArrayList<>(tempList));
        }
        else{
            for(int i = start;i<c.length;i++){
                tempList.add(c[i]);
                combination(res,tempList,i,c,rem-c[i]);
                tempList.remove(tempList.size()-1);
            }
        }
    }
}