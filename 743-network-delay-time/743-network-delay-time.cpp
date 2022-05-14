
class Solution {
public:
    int networkDelayTime(vector<vector<int>> &times, int N, int K) {
        vector<vector<pair<int, int>>> neighbors(N + 1);
        for (auto &t : times)
            neighbors[t[0]].emplace_back(t[1], t[2]);
        vector<int> dist(N + 1, INT_MAX);
        dist[K] = 0;
        auto comp = [&](int a, int b) {
            return dist[a] > dist[b];
        };
        vector<int> heap(N);
        for (int i = 0; i < N; ++i)
            heap[i] = i + 1;
        // Let V be the set of nodes.
        // V - heap is the set of nodes to which the shortest paths from node K are known.
        while (!heap.empty()) {
            // extract min
            make_heap(heap.begin(), heap.end(), comp);
            int u = heap.front();
            heap.front() = heap.back();
            heap.pop_back();
            // the closest node is unreachable
            if (dist[u] == INT_MAX)
                return -1;
            for (auto &p : neighbors[u]) {
                int v = p.first;
                int w = p.second;
                // O(1) time decrease key
                dist[v] = min(dist[v], dist[u] + w);
            }
        }
        return *max_element(dist.begin() + 1, dist.end());
    }
};