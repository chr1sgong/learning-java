package io.chr1s.graph;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

import java.io.IOException;

public interface Paths {

    /**
     * 是否存在从s到v的路径
     * @param v
     * @return
     */
    boolean hasPathTo(int v);

    /**
     * s到v的路径，如果不存在则返回null
     * @param v
     * @return
     */
    Iterable<Integer> pathTo(int v);

}
