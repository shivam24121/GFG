import java.util.*;

class Solution {
    public int minEdgeReversals(int n, int[][] edges, int src, int dst) {
        List<int[]>[] g = new ArrayList[n + 1];

        for (int i = 1; i <= n; i++)
            g[i] = new ArrayList<>();

        for (int[] e : edges) {
            int u = e[0], v = e[1];

            g[u].add(new int[]{v, 0});
            g[v].add(new int[]{u, 1});
        }

        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);

        Deque<Integer> dq = new ArrayDeque<>();
        dist[src] = 0;
        dq.addFirst(src);

        while (!dq.isEmpty()) {
            int u = dq.pollFirst();

            for (int[] e : g[u]) {
                int v = e[0];
                int cost = e[1];

                if (dist[u] + cost < dist[v]) {
                    dist[v] = dist[u] + cost;

                    if (cost == 0)
                        dq.addFirst(v);
                    else
                        dq.addLast(v);
                }
            }
        }

        return dist[dst] == Integer.MAX_VALUE ? -1 : dist[dst];
    }
}
