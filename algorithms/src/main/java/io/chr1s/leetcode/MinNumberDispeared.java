package io.chr1s.leetcode;

public class MinNumberDispeared {

    public int minNumberdisappered (int[] arr) {
        // write code here
//        int max = -1;
//        for (int i = 0; i < arr.length; i++) {
//            max = Math.max(max, arr[i]);
//        }
//        for (int i = 0; i < max; i++) {
//
//        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == i+1) continue;
            if (arr[i] < 0 || arr[i] > arr.length) continue;
            int newIdx = arr[i];
            int temp = arr[newIdx];
            arr[newIdx] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (arr[i] != i + 1) return i+1;
        }
        return arr.length;
    }

    public static void main(String[] args) {
        System.out.println("res: " + new MinNumberDispeared().minNumberdisappered(new int[] {1,2,3,5}));
    }
}
