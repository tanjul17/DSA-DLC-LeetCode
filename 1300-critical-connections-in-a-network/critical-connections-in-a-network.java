class Edge {
    int dest;

    public Edge(int dest) {
        this.dest = dest;
    }
}

public class Solution {
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        List<List<Integer>> result = new ArrayList<>();
        ArrayList<Edge>[] graph = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (List<Integer> connection : connections) {
            int src = connection.get(0);
            int dest = connection.get(1);
            graph[src].add(new Edge(dest));
            graph[dest].add(new Edge(src));
        }

        tarjanBridge(graph, n, result);

        return result;
    }

    public static void dfs(ArrayList<Edge> graph[], int curr, int par, int dt[], int low[], boolean vis[], int time, List<List<Integer>> result) {
        vis[curr] = true;
        dt[curr] = low[curr] = ++time;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);// e.src --- e.dest
            int neigh = e.dest;
            if (neigh == par) {
                continue;
            } else if (!vis[neigh]) {
                dfs(graph, neigh, curr, dt, low, vis, time, result);
                low[curr] = Math.min(low[curr], low[neigh]);
                if (dt[curr] < low[neigh]) {
                    List<Integer> criticalConnection = new ArrayList<>();
                    criticalConnection.add(curr);
                    criticalConnection.add(neigh);
                    result.add(criticalConnection);
                }
            } else {
                low[curr] = Math.min(low[curr], dt[neigh]);
            }
        }
    }

    public static void tarjanBridge(ArrayList<Edge> graph[], int V, List<List<Integer>> result) {
        int dt[] = new int[V];
        int low[] = new int[V];
        int time = 0;
        boolean vis[] = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                dfs(graph, i, -1, dt, low, vis, time, result);
            }
        }
    }
}
