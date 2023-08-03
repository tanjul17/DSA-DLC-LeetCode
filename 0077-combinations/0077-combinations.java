class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> data = new ArrayList<>();
        printCombination(ans,1,data,n,k);
        return ans;
    }

    public void printCombination(List<List<Integer>> ans, int start, ArrayList<Integer> data,int n, int k) {
        //base case
        if (data.size()== k) {
            ans.add(new ArrayList<>(data)); 
        }else {
            for(int i=start;i<=n;i++){
                data.add(i);
                printCombination(ans,i+1, data, n, k);//backtrack
                data.remove(data.size() - 1);
            }
        }
    }
}
