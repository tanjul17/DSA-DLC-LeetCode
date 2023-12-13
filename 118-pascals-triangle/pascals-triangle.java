class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0;i<numRows;i++){
            ArrayList<Integer> r = new ArrayList<>();
            for(int j = 0;j<=i;j++){
                if(j==0||j==i){
                    r.add(1);
                }else{
                    List<Integer>preRow = res.get(i-1);
                    int num = preRow.get(j-1)+preRow.get(j);
                    r.add(num);
                }
            }
            res.add(r);
        }
        return res;
    }
}