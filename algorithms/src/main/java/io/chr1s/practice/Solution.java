package io.chr1s.practice;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gongqi <qgong92@gmail.com>
 * Created on 2022-04-14
 */
public class Solution {

    public static List<Integer> sumInRanges(int[] arr, int n, List<List<Long>> queries, int q) {

        // Write your code here!
        List<Integer> res = new ArrayList<>();
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];
        for (int i = 1; i < n; ++i) {
            prefixSum[i] = arr[i] + prefixSum[i - 1];
        }
        for (List<Long> query : queries) {
            long left = query.get(0);
            long right = query.get(1);
            long len = right - left + 1;
            long currRes = (len / n) * prefixSum[n - 1];
            left %= n;
            right %= n;
            currRes += prefixSum[(int)right] - (left == 0 ? 0 : prefixSum[(int)left - 1]);
            res.add((int)(currRes % 1000000007));
        }
        return res;
    }


}
