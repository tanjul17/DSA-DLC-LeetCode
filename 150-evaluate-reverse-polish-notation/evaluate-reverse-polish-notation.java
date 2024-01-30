class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if (isOp(tokens[i])) {
                int n2 = s.pop();
                int n1 = s.pop();
                if (tokens[i].equals("+")) {
                    s.push(n1 + n2);
                } else if (tokens[i].equals("-")) {
                    s.push(n1 - n2);
                } else if (tokens[i].equals("*")) {
                    s.push(n1 * n2);
                } else if (tokens[i].equals("/")) {
                    s.push(n1 / n2);
                }
            } else {
                int n = Integer.parseInt(tokens[i]);
                s.push(n);
            }
        }
        return s.peek();
    }

    public boolean isOp(String tokens) {
        return tokens.equals("+") || tokens.equals("-") || tokens.equals("*") || tokens.equals("/");
    }
}
