package com.javagdy3.sortowania.bubble;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] opt = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] pes = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        System.out.println("Optymistyczny:");
        BubbleSort.sort(opt);
        System.out.println(Arrays.toString(opt));

        System.out.println("Pesymistyczny:");
        BubbleSort.sort(pes);
        System.out.println(Arrays.toString(pes));
    }
}
