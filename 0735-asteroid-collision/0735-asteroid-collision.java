class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<Integer>();
        for (int i : asteroids) {
            boolean flag = true;
            while (!st.isEmpty() && (st.peek() > 0 && i < 0)) {
                if (Math.abs(st.peek()) < Math.abs(i)) {
                    st.pop();
                    continue;
                }
                else if (Math.abs(st.peek()) == Math.abs(i)) {
                    st.pop();
                }
                flag = false;
                break;
            }
            if (flag) {
                st.push(i);
            }
        }
        int[] ans = new int[st.size()];
        for (int i = ans.length - 1; i >= 0; i--) {
            ans[i] = st.peek();
            st.pop();
        }
        return ans;
    }
}