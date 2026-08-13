class Solution {
    public int[] maxDistance(int V, int src, ArrayList<ArrayList<Integer>> edges) {
        ArrayList<int[]>[] graph = new ArrayList[V];

        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        for (ArrayList<Integer> edge : edges) {
            int u = edge.get(0);
            int v = edge.get(1);
            int w = edge.get(2);

            graph[u].add(new int[]{v, w});
        }

        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                dfs(i, graph, visited, stack);
            }
        }

        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MIN_VALUE);

        dist[src] = 0;

        while (!stack.isEmpty()) {
            int u = stack.pop();

            if (dist[u] == Integer.MIN_VALUE)
                continue;

            for (int[] edge : graph[u]) {
                int v = edge[0];
                int w = edge[1];

                dist[v] = Math.max(dist[v], dist[u] + w);
            }
        }

        return dist;
    }

    private void dfs(int u, ArrayList<int[]>[] graph,
                     boolean[] visited, Stack<Integer> stack) {

        visited[u] = true;

        for (int[] edge : graph[u]) {
            int v = edge[0];

            if (!visited[v]) {
                dfs(v, graph, visited, stack);
            }
        }

        stack.push(u);
    }
}
