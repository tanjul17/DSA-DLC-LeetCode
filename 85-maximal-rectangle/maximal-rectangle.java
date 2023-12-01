class Solution {
    public static int maximalRectangle(char[][] matrix) {
        int[] a = new int[matrix[0].length];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                a[j] = matrix[i][j] == '1' ? a[j] + 1 : 0;
            }
            max = Math.max(max, maxAreaHistogramhelper(a));
        }
        return max;
    }

    public static int maxAreaHistogramhelper(int[] a) {
        Stack<Integer> s = new Stack<>();
        int[] nsr = new int[a.length];
        int[] nsl = new int[a.length];
        int maxArea = 0;

        // Next Smaller element in left
        for (int i = 0; i < a.length; i++) {
            while (!s.isEmpty() && a[s.peek()] >= a[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        // Next Smaller element in right
        s = new Stack<>();
        for (int i = a.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && a[s.peek()] >= a[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = a.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        // Current area
        for (int i = 0; i < a.length; i++) {
            int height = a[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width;
            maxArea = Math.max(maxArea, currArea);
        }
        return maxArea;
    }
}
