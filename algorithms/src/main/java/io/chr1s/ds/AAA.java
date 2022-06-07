package io.chr1s.ds;

/**
 * @author gongqi <qgong92@gmail.com>
 * Created on 2022-04-22
 */
public class AAA {

    public void answer(int[] input) {
        if (input == null) {
            return;
        }
        int N = input.length;
        if (N == 1) {
            return;
        }
        int oneCnt = 0;
        int mOneCnt = 0;
        for (int i = 0; i < N; i++) {
            if (input[i] == 1) {
                oneCnt++;
            } else if (input[i] == -1) {
                mOneCnt++;
            }
        }
        for (int i = 0; i < N; i++) {
            if (i < oneCnt) {
                input[i] = 1;
            } else if (i < oneCnt + mOneCnt) {
                input[i] = -1;
            } else {
                input[i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1, 1, -1, 0, -1, 1, 0};
        new AAA().answer(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
