package io.chr1s.basic;

import java.util.HashMap;

public class FinalTest {

    private final int i;

    public FinalTest() {
        this.i = 5;
    }

    public static void main(String[] args) {
        FinalTest test = new FinalTest();
        System.out.print(test.i);
    }
}
