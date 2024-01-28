class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n = temp.length;
        int res [] = new int [n];
        Stack<Integer>s=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && temp[s.peek()]<=temp[i]){
                s.pop();
            }
            if(s.isEmpty())res[i] = 0;
            else res[i] = s.peek()-i;
            s.push(i);
        }
        return res;
    }
}
//variation of NGR