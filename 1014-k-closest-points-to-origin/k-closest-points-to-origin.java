class Solution {
    static class Point implements Comparable<Point> {
        int x;
        int y;
        int distSq;
        int idx;

        public Point(int x, int y, int distSq, int idx) {
            this.x = x;
            this.y = y;
            this.distSq = distSq;
            this.idx = idx;
        }

        @Override
        public int compareTo(Point p2) {
            return this.distSq - p2.distSq;
        }
    }

    public int[][] kClosest(int[][] pts, int k) {
        PriorityQueue<Point> pq = new PriorityQueue<>();
        int[][] res = new int[k][2]; 

        for (int i = 0; i < pts.length; i++) {
            int distSq = pts[i][0] * pts[i][0] + pts[i][1] * pts[i][1];
            pq.add(new Point(pts[i][0], pts[i][1], distSq, i));
        }

        for (int i = 0; i < k; i++) {
            Point closest = pq.poll();
            res[i][0] = closest.x;
            res[i][1] = closest.y;
        }
        return res;
    }
}
