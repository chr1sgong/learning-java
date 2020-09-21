package io.chr1s.graph;

import edu.princeton.cs.algs4.Bag;

import java.util.ArrayList;
import java.util.List;

public class SCC {

    private boolean[] onStack;

    private List<Bag<Integer>> map;

    /**
     * 预处理构造函数
     * @param G
     */
    public SCC(Digraph G) {
        this.onStack = new boolean[G.V()];
        this.map = new ArrayList<>();
        for (int v = 0; v < G.V(); v++) {
            onStack[v] = true;
            dfs(G, v);
        }
    }

    private void dfs(Digraph G, int v) {
        for (int w : G.adj(v)) {
            if (!onStack[w]) {
                onStack[w] = true;
                dfs(G, w);
                onStack[w] = false;
            }
        }
    }

    /**
     * 顶点v和w是否强连通
     * @param v
     * @param w
     * @return
     */
    public boolean stronglyConnected(int v, int w) {
        return false;
    }

    /**
     * 图中的强连通分量的总数
     * @return
     */
    public int count() {
        return 0;
    }

    /**
     * v 所在的强连通分量的表标识符，0~count() - 1
     * @param v
     * @return
     */
    public int id(int v) {
        return 0;
    }


}
