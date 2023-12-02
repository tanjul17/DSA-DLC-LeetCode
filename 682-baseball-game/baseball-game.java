class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s = new Stack<>();
        for (String st : operations) {
            if (st.equals("+")) {
                int lastRound = s.pop();
                int currentRound = lastRound + s.peek();
                s.push(lastRound);
                s.push(currentRound);
            } else if (st.equals("D")) {
                s.push(2 * s.peek());
            } else if (st.equals("C")) {
                s.pop();
            } else {
                s.push(Integer.parseInt(st));
            }
        }
        
        int sum = 0;
        for (int score : s) {
            sum += score;
        }
        return sum;
    }
}
