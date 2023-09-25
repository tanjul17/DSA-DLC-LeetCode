//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int b[] = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }

            Solution obj = new Solution();
            List<Integer> ans = obj.maxCombinations(n, k, a, b);
            for (int e : ans) System.out.print(e + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Pair {
    int l, m;

    public Pair(int l, int m) {
        this.l = l;
        this.m = m;
    }

    @Override
    public int hashCode() {
        return Objects.hash(l, m);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Pair pair = (Pair) obj;
        return l == pair.l && m == pair.m;
    }
}

class PairSum implements Comparable<PairSum> {
    int sum, l, m;

    public PairSum(int sum, int l, int m) {
        this.sum = sum;
        this.l = l;
        this.m = m;
    }

    @Override
    public int compareTo(PairSum other) {
        return Integer.compare(other.sum, this.sum);
    }
}
class Solution {
      static List<Integer> maxCombinations(int N, int K, int A[], int B[]) {
        Arrays.sort(A);
        Arrays.sort(B);

        PriorityQueue<PairSum> sums = new PriorityQueue<>();
        HashSet<Pair> pairs = new HashSet<>();

        int l = N - 1;
        int m = N - 1;
        pairs.add(new Pair(l, m));
        sums.add(new PairSum(A[l] + B[m], l, m));

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < K; i++) {
            PairSum max = sums.poll();
            result.add(max.sum);
            l = max.l - 1;
            m = max.m;

            if (l >= 0 && m >= 0 && !pairs.contains(new Pair(l, m))) {
                sums.add(new PairSum(A[l] + B[m], l, m));
                pairs.add(new Pair(l, m));
            }

            l = max.l;
            m = max.m - 1;

            if (l >= 0 && m >= 0 && !pairs.contains(new Pair(l, m))) {
                sums.add(new PairSum(A[l] + B[m], l, m));
                pairs.add(new Pair(l, m));
            }
        }

        return result;
    }
}
